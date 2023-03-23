import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int N, B, min;
    static int[] arr;
    static boolean[] bool;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            arr = new int[N];
            bool = new boolean[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            min = Integer.MAX_VALUE;

            powerset(0);

            bw.write("#" + tc + " " + (min - B));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void powerset(int depth) {
        if(depth == N) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (bool[i]) sum += arr[i];
            }
            if (sum >= B) {
                if (min > sum) min = sum;
            }
            return;
        }

        bool[depth] = true;
        powerset(depth+1);
        bool[depth] = false;
        powerset(depth+1);
    }
}