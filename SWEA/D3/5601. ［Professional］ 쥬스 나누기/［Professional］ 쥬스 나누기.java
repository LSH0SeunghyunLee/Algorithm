import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            int N = Integer.parseInt(in.readLine());

            out.write("#" + tc + " ");
            for (int i = 0; i < N; i++) {
                out.write("1/" + N + " ");
            }
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
