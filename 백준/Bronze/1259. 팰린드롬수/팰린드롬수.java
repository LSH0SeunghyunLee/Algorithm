import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String msg = "yes";

            String line = br.readLine();
            if (line.equals("0")) break;

            for (int i = 0; i < line.length()/2; i++) {
                if (line.charAt(i) == line.charAt(line.length()-i-1)) continue;
                else msg = "no";
            }

            bw.write(msg);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
