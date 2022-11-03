import java.io.*;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            String answer = "yes";

            String N = in.readLine();

            if (Integer.parseInt(N) == 0) {
                break;
            } else {
                for (int i = 0; i < N.length()/2; i++) {
                    if (N.charAt(i) != N.charAt(N.length() - (i + 1))) {
                        answer = "no";
                        break;
                    }
                }
            }
            out.write(answer);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}