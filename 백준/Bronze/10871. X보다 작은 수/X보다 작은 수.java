import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int A = Integer.parseInt(tokenizer.nextToken());
        int B = Integer.parseInt(tokenizer.nextToken());
        
        tokenizer = new StringTokenizer(in.readLine());
        
        for (int i = 0; i < A; i++) {
            int C = Integer.parseInt(tokenizer.nextToken());
            if (C < B) {
                System.out.print(C);
                System.out.print(" ");
            }
        }

        in.close();
    }
}