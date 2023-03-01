import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            String line = in.readLine();

            out.write("#" + tc + " ");
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'a' ||
                        line.charAt(i) == 'e' ||
                        line.charAt(i) == 'i' ||
                        line.charAt(i) == 'o' ||
                        line.charAt(i) == 'u') continue;
                else out.write(line.charAt(i));
            }

            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
