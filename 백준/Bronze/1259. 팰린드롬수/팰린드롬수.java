import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();

            if (line.equals("0")) break;

            int flag = 0;

            for (int i = 0; i <= line.length()/2; i++) {
                if (line.charAt(i) != line.charAt(line.length() - (i + 1))) {
                    flag = 1;
                    break;
                }
            }

            if (flag != 1) System.out.println("yes");
            else System.out.println("no");
        }

        bw.flush();
        bw.close();
    }
}
