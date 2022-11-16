import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int M = Integer.parseInt(tokenizer.nextToken());
        int N = Integer.parseInt(tokenizer.nextToken());

        get_prime(N);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = M; i <= N; i++) {
            if (!prime[i]) {
                stringBuilder.append(i).append('\n');
            }
        }

        out.write(String.valueOf(stringBuilder));

        in.close();
        out.flush();
        out.close();
    }

    public static void get_prime(int N) {
        prime = new boolean[N + 1];

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(N); i++) {
            // 이미 체크된 배열이면 다음 반복문으로 skip
            if(prime[i]) {
                continue;
            }

            // i 의 배수들을 걸러주기 위한 반복문
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}