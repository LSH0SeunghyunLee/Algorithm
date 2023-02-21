import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            int N = Integer.parseInt(in.readLine());

            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            String[][] newArr = new String[N][3];

            for (int cycle = 0; cycle < 3; cycle++) {
                int[][] temp = new int[N][N];

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        temp[j][i] = arr[i][j];
                    }
                }

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        arr[i][j] = temp[i][Math.abs(N - 1 - j)];;
                    }
                }

                for (int i = 0; i < N; i++) {
                    String sum = "";
                    for (int j = 0; j < N; j++) {
                        sum = sum.concat(String.valueOf(arr[i][j]));
                    }
                    newArr[i][cycle] = sum;
                }
            }

            out.write("#" + tc);
            out.newLine();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    out.write(newArr[i][j] + " ");
                }
                out.newLine();
            }
        }

        in.close();
        out.flush();
        out.close();
    }
}
