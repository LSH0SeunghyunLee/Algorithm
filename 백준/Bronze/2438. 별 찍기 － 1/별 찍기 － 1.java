import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int A = Integer.parseInt(tokenizer.nextToken());

        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        in.close();
    }
}