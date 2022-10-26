import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(in.readLine());
        int B = A;
        int C = 0;
        
        while (true) {
            B = (B % 10) * 10 + (B / 10 + B % 10) % 10;
            C++;
            if (A==B) {
                break;
            }
        }
        
        System.out.println(C);

        in.close();
    }
}