import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(in.readLine());

            int A = Integer.parseInt(tokenizer.nextToken());
            int B = Integer.parseInt(tokenizer.nextToken());
            
            if (A == 0 && B == 0) {
                break;
            }
            
            System.out.println(A + B);
        }

        in.close();
    }
}