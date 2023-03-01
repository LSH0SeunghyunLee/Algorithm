import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            double p = Double.parseDouble(st.nextToken());
            double q = Double.parseDouble(st.nextToken());

            double s1 = (1 - p) * q;
            double s2 = p * (1 - q) * q;

            if (s1 < s2) {
                out.write("#" + tc + " YES");
            } else {
                out.write("#" + tc + " NO");
            }

            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
