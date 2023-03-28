import java.io.*;

public class Solution {
    static int initX, initY, endX, endY, possible;
    static int[][] arr;
    static boolean[][] visited;
    static int[] rd = {-1, 1, 0, 0};
    static int[] cd = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= 10; tc++) {
            br.readLine();
//        for (int tc = 1; tc <= testcase; tc++) {
            arr = new int[100][100];
            visited = new boolean[100][100];

            initX = 0;
            initY = 0;
            endX = 0;
            endY = 0;

            for (int i = 0; i < 100; i++) {
                String line = br.readLine();
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = line.charAt(j) - 48;
                    if (arr[i][j] == 1) visited[i][j] = true;
                    if (arr[i][j] == 2) {
                        initX = i;
                        initY = j;
                    }
                    if (arr[i][j] == 3) {
                        endX = i;
                        endY = j;
                    }
                }
            }

            possible = 0;

            dfs(1, 1);

            bw.write("#" + tc + " " + possible);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void dfs(int i, int j) {
        if (0 > i || i >= 100 || 0 > j || j >= 100 || visited[i][j]) return;
        else if (i == endX && j == endY) possible = 1;

        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            dfs(i + rd[k], j + cd[k]);
        }
    }
}