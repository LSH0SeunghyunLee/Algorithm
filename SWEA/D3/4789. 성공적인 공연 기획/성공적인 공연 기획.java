import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            String line = in.readLine();

            int[] arr = new int[line.length()];

            for (int i = 0; i < line.length(); i++) {
                arr[i] = line.charAt(i) - 48;
            }

            int sum = 0;
            int cnt = 0;

            for (int i = 0; i < line.length(); i++) {
                if (i > sum) {
                    cnt += i - sum;
                    sum += i - sum + arr[i];
                } else {
                    sum += arr[i];
                }
            }

            out.write("#" + tc + " " + cnt);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}