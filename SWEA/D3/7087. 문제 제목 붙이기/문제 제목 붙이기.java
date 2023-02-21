import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            int N = Integer.parseInt(in.readLine());

            int[] arr = new int[26];

            for (int i = 0; i < N; i++) {
                String line = in.readLine();
                int index = (int) line.charAt(0) - 65;
                arr[index]++;
            }

            int cnt = 0;

            for (int i = 0; i < 26; i++) {
                if (arr[i] == 0) break;
                cnt++;
            }

            out.write("#" + tc + " " + cnt);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}