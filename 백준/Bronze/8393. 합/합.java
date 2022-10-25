import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(in.readLine());

        int B = 0;
        
        for (int i = 0; i < A; i++) {
            B += (i+1);
        }

        System.out.println(B);
        
        in.close();
    }
}