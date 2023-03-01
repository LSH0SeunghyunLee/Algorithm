import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            int N = Integer.parseInt(in.readLine());

            int sum = 0;
            int[] arr = new int[N];

            StringTokenizer st = new StringTokenizer(in.readLine());

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            sum /= N;

            int cnt = 0;

            for (int i = 0; i < N; i++) {
                if (arr[i] <= sum) cnt++;
            }

            out.write("#" + tc + " " + cnt);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
