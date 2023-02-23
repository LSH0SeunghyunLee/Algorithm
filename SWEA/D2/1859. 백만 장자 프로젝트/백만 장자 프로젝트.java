import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            int N = Integer.parseInt(in.readLine());

            int[] arr = new int[N];

            StringTokenizer st = new StringTokenizer(in.readLine());

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int max = arr[N-1];

            long ans = 0;

            for(int i = N-2; i >= 0; i--) {
                if(max > arr[i]) {
                    ans += max - arr[i];
                } else {
                    max = arr[i];
                }
            }

            out.write("#" + tc + " " + ans);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}