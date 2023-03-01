import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            String line = in.readLine();

            for (int i = 0; i < line.length(); i++) {
                out.write(".");
                out.write(".#.");
            }
            out.write(".");
            out.newLine();
            out.write(".");
            for (int i = 0; i < line.length()*2; i++) {
                out.write("#.");
            }
            out.newLine();
            out.write("#");
            for (int i = 0; i < line.length(); i++) {
                out.write("." + line.charAt(i) + ".#");
            }
            out.newLine();
            out.write(".");
            for (int i = 0; i < line.length()*2; i++) {
                out.write("#.");
            }
            out.newLine();
            for (int i = 0; i < line.length(); i++) {
                out.write(".");
                out.write(".#.");
            }
            out.write(".");
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
