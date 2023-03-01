import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 3; i++) {
                String line = st.nextToken();
                sb.append(String.valueOf(line.charAt(0)).toUpperCase());
            }

            out.write("#" + tc + " " + sb);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
