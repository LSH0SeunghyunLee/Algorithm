import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int N, L, max;
    static int[][] arr;
    static boolean[] sel;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());

            arr = new int[N][2];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            sel = new boolean[N];
            max = 0;

            powerset(0);

            bw.write("#" + tc + " " + max);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void powerset(int idx) {
        if (idx == N) {
            int temp = sum()[0];
            int sum = sum()[1];
            if (sum < L && max < temp) max = temp;
            return;
        }

        sel[idx] = true;
        powerset(idx+1);

        sel[idx] = false;
        powerset(idx+1);
    }

    public static int[] sum() {
        int[] sum = new int[2];
        for (int i = 0; i < N; i++) {
            if (sel[i]) {
                sum[0] += arr[i][0];
                sum[1] += arr[i][1];
            }
        }
        return sum;
    }
}