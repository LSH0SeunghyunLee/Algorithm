import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(in.readLine());

        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < A; i++) {
            int C = Integer.parseInt(tokenizer.nextToken());

            if (C > max) {
                max = C;
            }

            sum += C;
        }

        out.write(String.valueOf((double) sum*100/(max*A)));

        in.close();
        out.flush();
        out.close();
    }
}