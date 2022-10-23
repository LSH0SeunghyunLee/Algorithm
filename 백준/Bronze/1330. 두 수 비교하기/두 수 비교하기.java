import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int A = Integer.parseInt(tokenizer.nextToken());
        int B = Integer.parseInt(tokenizer.nextToken());

        if (A > B) {
            out.write(">");
        } else if (A < B) {
            out.write("<");
        } else {
            out.write("==");
        }

        in.close();
        out.flush();
        out.close();
    }
}