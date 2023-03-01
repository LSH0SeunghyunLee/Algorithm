import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] arr = new int[N + M + 1];

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    arr[i+j]++;
                }
            }

            int max = 0;

            for (int i = 0; i < N+M+1; i++) {
                if (arr[i] > max) max = arr[i];
            }

            out.write("#" + tc + " ");
            for (int i = 0; i < N+M+1; i++) {
                if (arr[i] == max) out.write(i + " ");
            }
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
