import java.io.*;
import java.util.*;

public class Solution {
    static int N, L, min;
    static int[] flavor;
    static int[] calorie;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());

            flavor = new int[N+1];
            calorie = new int[L+1];

            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine());
                flavor[i] = Integer.parseInt(st.nextToken());
                calorie[i] = Integer.parseInt(st.nextToken());
            }

            dp = new int[N+1][L+1];

            for (int i = 1; i <= N; i++) {
                for (int j = 0; j <= L; j++) {
                    if (calorie[i] <= j) {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j- calorie[i]] + flavor[i]);
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }

            bw.write("#" + tc + " " + dp[N][L]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}