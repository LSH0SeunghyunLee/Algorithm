import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(in.readLine());
        
        int B = Integer.parseInt(in.readLine());

        if (A > 0 && B > 0) {
            System.out.println("1");
        } else if (A < 0 && B > 0) {
            System.out.println("2");
        } else if (A < 0 && B < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }

        in.close();
    }
}