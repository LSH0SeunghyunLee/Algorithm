import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        double A = Integer.parseInt(tokenizer.nextToken());
        double B = Integer.parseInt(tokenizer.nextToken());

        System.out.println(A/B);
    }
}