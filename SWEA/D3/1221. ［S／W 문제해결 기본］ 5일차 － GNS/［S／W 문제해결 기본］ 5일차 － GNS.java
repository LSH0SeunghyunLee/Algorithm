import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            st.nextToken();
            int N = Integer.parseInt(st.nextToken());

            int[] insert = new int[10];

            st = new StringTokenizer(in.readLine());

            for (int i = 0; i < N; i++) {
                String input = st.nextToken();
                for (int j = 0; j < 10; j++) {
                    if (input.equals(arr[j])) {
                        insert[j]++;
                        break;
                    }
                }
            }

            out.write("#" + tc);
            out.newLine();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < insert[i]; j++) {
                    out.write(arr[i] + " ");
                }
            }
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
