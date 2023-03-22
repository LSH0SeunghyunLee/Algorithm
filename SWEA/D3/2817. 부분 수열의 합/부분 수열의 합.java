import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int[] arr;
    static int N, K, cnt;
    static boolean[] sel;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[N];

            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            sel = new boolean[N];
            cnt = 0;

            powerset(0);

            out.write("#" + tc + " " + cnt);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }

    public static void powerset(int idx) {
        if (idx == N) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (sel[i]) sum += arr[i];
            }
            if (sum == K) cnt++;
            return;
        }

        sel[idx] = true;
        powerset(idx+1);

        sel[idx] = false;
        powerset(idx+1);
    }
}
