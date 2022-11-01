import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(in.readLine());
        int B = Integer.parseInt(in.readLine());
        int C = Integer.parseInt(in.readLine());

        int multiply = A * B * C;
        String temp = Integer.toString(multiply);

        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == (i + '0')) {
                    sum++;
                }
            }
            out.write(String.valueOf(sum));
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}