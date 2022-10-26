import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(in.readLine());
        
        for (int i = A; i > 0; i--) {
            System.out.println(i);
        }

        in.close();
    }
}