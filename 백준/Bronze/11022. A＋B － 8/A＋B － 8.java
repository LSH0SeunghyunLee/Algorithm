import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(in.readLine());

            int A = Integer.parseInt(tokenizer.nextToken());
            int B = Integer.parseInt(tokenizer.nextToken());

            out.write("Case #" + String.valueOf(i) + ": " + String.valueOf(A) + " + " + String.valueOf(B) + " = " + String.valueOf(A + B));
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}