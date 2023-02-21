import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int D = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            boolean[] arr = Eratosthenes(B);

            int cnt = 0;

            for (int i = A; i <= B; i++) {
                if (arr[i] && String.valueOf(i).contains(String.valueOf(D))) cnt++;
            }

            out.write("#" + tc + " " + cnt);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }

    public static boolean[] Eratosthenes(int number) {
        boolean[] isPrime = new boolean[number+1];
        // 소수는 true
        Arrays.fill(isPrime, true);

        // 0, 1은 소수가 아니므로 false
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i * i <= number; i++){
            if(isPrime[i]){
                // i 의 배수들도 소수가 아니므로 false 로 만든다.
                for(int j = i * i; j <= number; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}