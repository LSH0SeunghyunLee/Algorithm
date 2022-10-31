import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE;
        
        int n = 0;
        
        for (int i = 0; i < 9; i++) {
            int A = Integer.parseInt(in.readLine());

            if (A > max) {
                max = A;
                n = i + 1;
            }
        }

        out.write(String.valueOf(max));
        out.newLine();
        out.write(String.valueOf(n));

        in.close();
        out.flush();
        out.close();
    }
}