import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int sum = 0;
        
        for (int i = 0; i < 5; i++) {
            int A = Integer.parseInt(tokenizer.nextToken());

            sum += A*A;
        }

        out.write(String.valueOf(sum%10));

        in.close();
        out.flush();
        out.close();
    }
}