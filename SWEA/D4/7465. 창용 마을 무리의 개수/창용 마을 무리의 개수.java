import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    static int N, M;
    static int[] p, rank;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());  // V : 정점의 개수, 0부터 시작
            M = Integer.parseInt(st.nextToken());  // E : 간선의 수

            p = new int[N+1];
            rank = new int[N+1];

            for (int i = 0; i < N+1; i++) {
                makeset(i);
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                union(a, b);
            }

            for (int i = 0; i < N+1; i++) {
                if (findset(i) != i) p[i] = findset(i);
            }

            Arrays.sort(p);

            int cnt = 1;

            for (int i = 2; i < N+1; i++) {
                if (p[i] != p[i-1]) cnt++;
            }

            bw.write("#" + tc + " " + cnt);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    static void makeset(int x) {
        p[x] = x;
//        rank[x] = 0;
    }

    static int findset(int x) {
        if (x != p[x]) p[x] = findset(p[x]);
        return p[x];
    }

    static void union(int x, int y) {
        p[findset(y)] = findset(x);
//        link(findset(y), findset(x));
    }

//    static void link(int x, int y) {
//        if (rank[x] > rank[y]) {
//            p[y] = x;
//        } else {
//            p[x] = y;
//            if (rank[x] == rank[y]) rank[y]++;
//        }
//    }
}