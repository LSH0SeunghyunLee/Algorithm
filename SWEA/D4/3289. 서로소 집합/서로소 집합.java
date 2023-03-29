import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int V, E;
    static int[] p;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            V = Integer.parseInt(st.nextToken());  // V : 정점의 개수, 0부터 시작
            E = Integer.parseInt(st.nextToken());  // E : 간선의 수

            p = new int[V+1];

            for (int i = 0; i < V; i++) {
                makeset(i);
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int check = Integer.parseInt(st.nextToken());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if (check == 0) union(a, b);
                else {
                    if (findset(a) == findset(b)) sb.append("1");
                    else sb.append("0");
                }
            }

            bw.write("#" + tc + " " + sb);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    static void makeset(int x) {
        p[x] = x;
        // Rank 따로 설정 X
    }

    // 대표를 반환해야 하므로
    static int findset(int x) {
        // 순수 기술
//        if (x == p[x]) return x;
//        return findset(p[x]);

        // path compression 적용
        if (x != p[x]) p[x] = findset(p[x]);
        return p[x];
    }

    static void union(int x, int y) {
        p[findset(y)] = findset(x);
        // Rank 고려 X, 그냥 무조건 y를 x 밑으로 설정
    }
}