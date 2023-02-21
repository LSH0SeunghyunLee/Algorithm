import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= 10; i++) {
            in.readLine();

            int[][] arr = new int[100][100];

            for (int j = 0; j < 100; j++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                for (int k = 0; k < 100; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;
            int sum = 0;

            for (int j = 0; j < 100; j++) {
                List<Integer> list = new ArrayList<>();
                for (int k = 0; k < 100; k++) {
                    if (arr[k][j] != 0) list.add(arr[k][j]);
                }
                int size = list.size();
                for (int k = 0; k < size-1; k++) {
                    if (list.get(k) == 1 && list.get(k+1) == 2) cnt++;
                }
                sum+=cnt;
                cnt=0;
            }

            out.write("#" + i + " " + sum);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
