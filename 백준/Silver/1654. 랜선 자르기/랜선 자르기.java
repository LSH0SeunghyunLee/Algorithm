import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int K = Integer.parseInt(tokenizer.nextToken());
        int N = Integer.parseInt(tokenizer.nextToken());

        int[] list = new int[K];

        long max = 0;

        for (int i = 0; i < K; i++) {
            list[i] = Integer.parseInt(in.readLine());
            if (max < list[i]) {
                max = list[i];
            }
        }

        max++;

        long min = 0;
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2;

            long count = 0;

            for (int i = 0; i < K; i++) {
                count += (list[i] / mid);
            }

            if(count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        out.write(String.valueOf(min - 1));

        in.close();
        out.flush();
        out.close();
    }
}