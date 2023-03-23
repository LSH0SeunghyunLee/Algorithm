import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int cnt1, cnt2;
    static int[] arr1, arr2;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr1 = new int[9];
            arr2 = new int[9];

            for (int i = 0; i < 9; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }

            int idx = 0;

            for (int i = 1; i <= 18; i++) {
                for (int j = 0; j < 9; j++) {
                    if (i == arr1[j]) break;
                    if (j == 8) {
                        arr2[idx] = i;
                        idx++;
                    }
                }
            }

            result = new int[9];

            cnt1 = 0;
            cnt2 = 0;

            perm(0, 0);

            bw.write("#" + tc + " " + cnt1 + " " + cnt2);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void perm(int idx, int visited) {
        if(idx == 9) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < 9; i++) {
                if (arr1[i] > result[i]) sum1 += arr1[i] + result[i];
                else if (arr1[i] < result[i]) sum2 += result[i] + arr1[i];
            }
            if (sum1 > sum2) cnt1++;
            else if (sum1 < sum2) cnt2++;
            return;
        }

        for(int i = 0 ; i < 9; i++) {
            if ((visited & (1<<i)) != 0) continue;

            result[idx] = arr2[i];
            perm(idx+1, visited | (1<<i));
        }
    }
}