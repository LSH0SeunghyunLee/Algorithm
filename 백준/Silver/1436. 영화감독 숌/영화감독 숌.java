import java.io.*;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());

        int end = 666;
        int cnt = 1;

        while (cnt != N) {
            end++;

            if (String.valueOf(end).contains("666")) {
                cnt++;
            }
        }

        out.write(String.valueOf(end));

        in.close();
        out.flush();
        out.close();
    }
}