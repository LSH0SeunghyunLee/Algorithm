import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int N, max, maxVal;
    static int[][] arr;
    static boolean[][] visited;
    static int[] rd = {-1, 1, 0, 0};
    static int[] cd = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            N = Integer.parseInt(br.readLine());

            arr = new int[N][N];

            maxVal = 0;

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    maxVal = Math.max(maxVal, arr[i][j]);
                }
            }

            max = 1;

            dfs(1);

            bw.write("#" + tc + " " + max);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void dfs(int day) {
        // 갉아먹음
        ate(day);

        // 방문 처리를 위한 초기화
        visited = new boolean[N][N];

        int cnt = 0;

        // 방문한 노드에 인접한 노드 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                boolean status = check(i, j);
                if (status) cnt++;
            }
        }

        max = Math.max(cnt, max);

        if (day + 1 <= maxVal) {
            dfs(day+1);
        }
    }

    private static void ate(int day) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == day) arr[i][j] = 0;
            }
        }
    }

    private static boolean check(int i, int j) {
        boolean checked = false;
        if (0 <= i && i < N && 0 <= j && j < N && arr[i][j] != 0 && !visited[i][j]) {
            checked = true;
            visited[i][j] = true;
            for (int k = 0; k < 4; k++) {
                check(i + rd[k], j + cd[k]);
            }

        }
        return checked;
    }
}