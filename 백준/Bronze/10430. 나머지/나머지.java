import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int A = Integer.parseInt(tokenizer.nextToken());
        int B = Integer.parseInt(tokenizer.nextToken());
        int C = Integer.parseInt(tokenizer.nextToken());

        out.write(String.valueOf((A + B) % C));
        out.newLine();
        out.write(String.valueOf(((A % C) + (B % C)) % C));
        out.newLine();
        out.write(String.valueOf((A * B) % C));
        out.newLine();
        out.write(String.valueOf(((A % C) * (B % C)) % C));

        in.close();
        out.flush();
        out.close();
    }
}