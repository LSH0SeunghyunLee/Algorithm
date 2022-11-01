import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 2; i++) {
            int A = Integer.parseInt(tokenizer.nextToken());
            String my_string = Integer.toString(A);
            StringBuffer sb = new StringBuffer(my_string);
            String reverse = sb.reverse().toString();
            int B = Integer.parseInt(reverse);

            if (B > max) {
                max = B;
            }
        }

        out.write(String.valueOf(max));

        in.close();
        out.flush();
        out.close();
    }
}