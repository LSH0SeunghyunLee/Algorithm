import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            String line = in.readLine();

            String msg = "";

            int S = 13;
            int D = 13;
            int H = 13;
            int C = 13;

            for (int i = 0; i < line.length(); i+=3) {
                for (int j = i + 3; j < line.length(); j+=3) {
                    if (line.charAt(i) == line.charAt(j)) {
                        if (line.charAt(i+1) == line.charAt(j+1) &&
                            line.charAt(i+2) == line.charAt(j+2))
                            msg = "ERROR";
                    }
                }
            }

            for (int i = 0; i < line.length(); i+=3) {
                if (line.charAt(i) == 'S') S--;
                if (line.charAt(i) == 'D') D--;
                if (line.charAt(i) == 'H') H--;
                if (line.charAt(i) == 'C') C--;
            }

            if (!msg.equals("ERROR")) {
                msg = S + " " + D + " " + H + " " + C;
            }

            out.write("#" + tc + " " + msg);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}