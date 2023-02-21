import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            int[][] arr = new int[9][9];

            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int msg = 1;

            Loop:
            for (int i = 0; i < 9; i++) {
                int[] check = new int[10];
                for (int j = 0; j < 9; j++) {
                    check[arr[i][j]]++;
                    if (check[arr[i][j]]==2) {
                        msg = 0;
                        break Loop;
                    }
                }
                check = new int[10];
                for (int j = 0; j < 9; j++) {
                    check[arr[j][i]]++;
                    if (check[arr[j][i]]==2) {
                        msg = 0;
                        break Loop;
                    }
                }
                check = new int[10];
                int idx = 0;
                for (int j = 0; j < 9; j++) {
                    check[arr[idx][j%3]]++;
                    if (check[arr[idx][j%3]]==2) {
                        msg = 0;
                        break Loop;
                    }
                    if (j%3 == 2) idx++;
                }
            }

            out.write("#" + tc + " " + msg);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
