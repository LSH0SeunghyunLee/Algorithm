import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int D, W, K, min;
    static int[][] arr;
    static int[] arrA, arrB;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            D = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[D][W];

            for (int i = 0; i < D; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            min = K;

            arrA = new int[W];
            arrB = new int[W];

            for (int i = 0; i < W; i++) {
                arrB[i] = 1;
            }

            for (int i = K; i >= 0; i--) {
                combination(0, 0, i);
            }

            bw.write("#" + tc + " " + min);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void combination(int idx, int sidx, int type) {
        if (sidx == type) {
            if (check()) {
                if (type < min) min = type;
                return;
            }
            return;
        }

        if (idx == D) {
            return;
        }

        int[] temp = arr[idx];

        combination(idx+1, sidx, type);

        arr[idx] = arrA;
        combination(idx+1, sidx+1, type);

        arr[idx] = arrB;
        combination(idx+1, sidx+1, type);

        arr[idx] = temp;
    }

    public static boolean check() {
        for (int i = 0; i < W; i++) {
            int cntA = 1;
            int cntB = 1;
            for (int j = 1; j < D; j++) {
                if (arr[j][i] == 0) {
                    cntB = 0;
                    if (arr[j-1][i] == 0) cntA++;
                    else cntA = 1;
                } else if (arr[j][i] == 1) {
                    cntA = 0;
                    if (arr[j-1][i] == 1) cntB++;
                    else cntB = 1;
                }
                if (cntA == K || cntB == K) break;
                if (j == D-1) return false;
            }
        }
        return true;
    }
}