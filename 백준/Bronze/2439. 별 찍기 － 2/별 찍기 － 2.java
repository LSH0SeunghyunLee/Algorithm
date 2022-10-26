import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(in.readLine());
        
        for (int i = 1; i <= A; i++) {
            String B = " ";
            String C = "*";
            String D = B.repeat((A-i)) + C.repeat(i);
            System.out.println(D);
        }

        in.close();
    }
}