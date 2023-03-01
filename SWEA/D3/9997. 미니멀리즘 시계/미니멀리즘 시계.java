import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            int N = Integer.parseInt(in.readLine());

            int hour = N / 30;
            int minute = (N % 30) * 2;

            out.write("#" + tc + " " + hour + " " + minute);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
