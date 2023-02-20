import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(in.readLine());

        int[][] arr = new int[100][100];

        for (int i = 0; i < K; i++) {
            StringTokenizer tokenizer = new StringTokenizer(in.readLine());

            int A = Integer.parseInt(tokenizer.nextToken());
            int B = Integer.parseInt(tokenizer.nextToken());

            for (int j = A; j < A+10; j++) {
                for (int k = B; k < B+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += arr[i][j];
            }
        }

        out.write(String.valueOf(sum));
        out.newLine();

        in.close();
        out.flush();
        out.close();
    }
}
