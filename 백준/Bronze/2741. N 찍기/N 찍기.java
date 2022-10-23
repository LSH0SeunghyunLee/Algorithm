import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(in.readLine());

        for (int i = 1; i <= A; i++) {
            out.write(String.valueOf(i));
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}