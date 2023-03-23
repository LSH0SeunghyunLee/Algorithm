import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int N, L, max, score;
    static int[][] arr;
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

            max = 0;
            score = 0;

            powerset(0, 0);

            bw.write("#" + tc + " " + max);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void powerset(int n, int idx) {
        if (n <= L) {
            if (max < score) max = score;
        }
        if (n > L) return;

        for (int i = idx; i < N; i++) {
            score += arr[i][0];
            powerset(n+arr[i][1], i+1);
            score -= arr[i][0];
        }
    }
}