import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int sum = 0;

            for (int i = 0; i < 5; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (a < 40) a = 40;
                sum += a;
            }

            sum /= 5;

            out.write("#" + tc + " " + sum);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
