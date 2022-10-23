import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int A = Integer.parseInt(tokenizer.nextToken());

        if (A >= 90) {
            out.write("A");
        } else if (A >= 80) {
            out.write("B");
        } else if (A >= 70) {
            out.write("C");
        } else if (A >= 60) {
            out.write("D");
        } else {
            out.write("F");
        }

        in.close();
        out.flush();
        out.close();
    }
}