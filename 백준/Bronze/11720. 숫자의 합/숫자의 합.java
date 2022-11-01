import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(in.readLine());
        String B = in.readLine();

        int C = 0;

        for (int i = 0; i < A; i++) {
            C += B.charAt(i) - '0';
        }

        out.write(String.valueOf(C));

        in.close();
        out.flush();
        out.close();
    }
}