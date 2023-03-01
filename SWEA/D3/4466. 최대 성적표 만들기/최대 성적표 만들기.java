import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] arr = new int[N];

            st = new StringTokenizer(in.readLine());

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int sum = 0;

            for (int i = 0; i < K; i++) {
                sum += arr[N-1-i];
            }

            out.write("#" + tc + " " + sum);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}