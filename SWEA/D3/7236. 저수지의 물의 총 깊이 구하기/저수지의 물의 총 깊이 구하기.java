import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            int N = Integer.parseInt(in.readLine());

            String[][] arr = new String[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = st.nextToken();
                }
            }

            int max = 0;
            int cnt = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (arr[i][j].equals("W")) {
                        if (i < N-1 && j < N-1 && arr[i+1][j+1].equals("W")) cnt++;
                        if (i < N-1 && arr[i+1][j].equals("W")) cnt++;
                        if (i < N-1 && j > 0 && arr[i+1][j-1].equals("W")) cnt++;
                        if (i > 0 && j < N-1 && arr[i-1][j+1].equals("W")) cnt++;
                        if (i > 0 && arr[i-1][j].equals("W")) cnt++;
                        if (i > 0 && j > 0 && arr[i-1][j-1].equals("W")) cnt++;
                        if (j < N-1 && arr[i][j+1].equals("W")) cnt++;
                        if (j > 0 && arr[i][j-1].equals("W")) cnt++;
                    }
                    if (cnt > max) {
                        max = cnt;
                    }
                    cnt = 0;
                }
            }

            if (max == 0) max++;

            out.write("#" + tc + " " + max);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}