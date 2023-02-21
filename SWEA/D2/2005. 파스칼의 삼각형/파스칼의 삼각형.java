import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            int A = Integer.parseInt(in.readLine());

            int idx = 1;
            int[] arr = new int[1];
            int[] exArr = new int[2];

            out.write("#" + tc);
            out.newLine();
            while (idx <= A) {
                if (idx > 2) {
                    exArr = arr;
                }
                arr = new int[idx];
                arr[0] = 1;
                if (idx > 1) {
                    arr[idx-1] = 1;
                }
                for (int i = 1; i < idx-1; i++) {
                    arr[i] = exArr[i-1] + exArr[i];
                }
                for (int i = 0; i < idx; i++) {
                    out.write(arr[i] + " ");
                }
                out.newLine();
                idx++;
            }

        }

        in.close();
        out.flush();
        out.close();
    }
}
