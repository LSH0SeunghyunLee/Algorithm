import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int tc = 1; tc <= 10; tc++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int result = pow_recursive(C, N);

            bw.write("#" + tc + " " + result);
            bw.newLine();
        }


        bw.flush();
        bw.close();
    }

    public static int pow_recursive(int C, int N) {
        // 기저조건
        if (N == 1) return C;

        // 재귀조건
        // 1. 짝수일 때
        if (N % 2 == 0) {
            C = pow_recursive(C, N/2)*pow_recursive(C, N/2);
        }
        // 2. 홀수일 때
        if (N % 2 == 1) {
            C = pow_recursive(C, (N-1)/2)*pow_recursive(C, (N-1)/2)*C;
        }

        return C;
    }
}
