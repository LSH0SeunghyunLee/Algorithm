import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            int[] arr = new int[10];

            StringTokenizer st = new StringTokenizer(in.readLine());

            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int sum = 0;

            for (int i = 1; i < arr.length-1; i++) {
                sum += arr[i];
            }

            if (sum%8 >= 4) {
                sum = sum / 8 + 1;
            } else {
                sum /= 8;
            }


            out.write("#" + tc + " " + sum);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
