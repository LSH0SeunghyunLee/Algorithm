import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int N, M, max, K, result;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            K = 1;
            max = 0;

            while (K < 2 * N) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        int cnt = 0;
                        for (int k = 0; k < N; k++) {
                            for (int l = 0; l < N; l++) {
                                if (Math.abs(i-k) + Math.abs(j-l) < K && arr[k][l] == 1) cnt++;
                            }
                        }
                        max = Math.max(max, cnt);
                        int cost = (int) Math.pow(2*K-1, 2) - 4 * factorial(K);
                        if (M * max - cost >= 0) result = max;
                    }
                }
                K++;
            }


            bw.write("#" + tc + " " + result);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    static int factorial(int K) {
        int sum = 0;
        for (int i = 1; i < K; i++) {
            sum += i;
        }
        return sum;
    }
}