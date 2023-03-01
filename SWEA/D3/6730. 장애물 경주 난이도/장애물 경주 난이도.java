import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            int N = Integer.parseInt(in.readLine());

            int[] arr = new int[N];

            int upMax = 0;
            int downMax = 0;

            StringTokenizer st = new StringTokenizer(in.readLine());

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i < N; i++) {
                int a = arr[i] - arr[i-1];
                if (a > 0 && a > upMax) upMax = a;
                else if (a <= 0 && Math.abs(a) > downMax) downMax = Math.abs(a);
            }

            out.write("#" + tc + " " + upMax + " " + downMax);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
