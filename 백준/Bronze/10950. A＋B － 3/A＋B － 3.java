import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(in.readLine());
        
        for (int i = 0; i < A; i++) {
            StringTokenizer tokenizer = new StringTokenizer(in.readLine());

            int B = Integer.parseInt(tokenizer.nextToken());
            int C = Integer.parseInt(tokenizer.nextToken());
            
            System.out.println(B+C);
        }

        in.close();
    }
}