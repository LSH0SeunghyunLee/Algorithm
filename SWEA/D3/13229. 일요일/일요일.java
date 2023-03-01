import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] weekArr = {"0", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            String line = in.readLine();

            int temp = 0;

            for (int i = 0; i < 8; i++) {
                if (line.equals(weekArr[i])) {
                    temp = i;
                    break;
                }
            }

            int result;

            if (temp == 7) result = 7;
            else result = 7 - temp;

            out.write("#" + tc + " " + result);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
