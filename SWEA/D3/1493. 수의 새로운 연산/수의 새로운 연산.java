import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            int pIdx = 0;
            int pSum = 0;
            int qIdx = 0;
            int qSum = 0;

            while (p > pSum) {
                pIdx++;
                pSum += pIdx;
            }

            while (q > qSum) {
                qIdx++;
                qSum += qIdx;
            }

            int px = pIdx - pSum + p;
            int py = 1 + pSum - p;
            int qx = qIdx - qSum + q;
            int qy = 1 + qSum - q;

            int x = px + qx;
            int y = py + qy;

            int sum = 0;
            int idx = 0;

            while (idx != (x + y) - 1) {
                idx++;
                sum += idx;
            }
            sum = sum - y + 1;

            out.write("#" + tc + " " + sum);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
