import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            String line = in.readLine();

            if ((line.charAt(line.length()-1) - 48) % 2 == 1) out.write("#" + tc + " Odd");
            else out.write("#" + tc + " Even");


            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
