import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int start = 666;
        int cnt = 0;

        while (true) {
            if (String.valueOf(start).contains("666")) {
                cnt++;
                if (cnt == N) break;
            }

            start++;
        }

        bw.write(start+"");
        bw.flush();
        bw.close();
    }
}
