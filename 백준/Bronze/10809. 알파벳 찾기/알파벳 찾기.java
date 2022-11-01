import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = in.readLine();

        for (int i = 0; i < 26; i++) {
            int location = -1;
            for (int j = 0; j < word.length(); j++) {
                if ((word.charAt(j) - 'a') == i) {
                    location = j;
                    break;
                }
            }
            out.write(String.valueOf(location));
            out.write(" ");
        }

        in.close();
        out.flush();
        out.close();
    }
}