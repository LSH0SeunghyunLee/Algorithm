import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int N = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());

            int[] arr = new int[N];

            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;

            if (arr[0] == 0) {
                cnt++;
                arr[0] = 1;
            }

            if (arr[N-1] == 0) {
                cnt++;
                arr[N-1] = 1;
            }

            int flag = 0;
            for (int i = 1; i < N-1; i++) {
                if (arr[i] == 0) flag++;
                else  flag = 0;
                if (flag == D) {
                    cnt++;
                    flag = 0;
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