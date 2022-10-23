import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int A = Integer.parseInt(tokenizer.nextToken());

        for (int i = 1; i <= 9; i++) {
            out.write(A + " * " + i + " = " + Integer.valueOf(A * i));
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}