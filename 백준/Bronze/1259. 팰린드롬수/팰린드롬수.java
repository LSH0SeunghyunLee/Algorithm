import java.io.*;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            String answer = "no";

            String N = in.readLine();

            char[] list = N.toCharArray();

            if (Integer.parseInt(N) == 0) {
                break;
            } else if (N.length() % 2 == 0) {
                for (int i = 0; i < N.length()/2; i++) {
                    if (list[i] == list[N.length() - (i + 1)]) {
                        answer = "yes";
                    } else {
                        answer = "no";
                        break;
                    }
                }
            } else {
                for (int i = 0; i < N.length()/2 + 1; i++) {
                    if (list[i] == list[N.length() - (i + 1)]) {
                        answer = "yes";
                    } else {
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