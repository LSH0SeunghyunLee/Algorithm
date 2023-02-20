import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(in.readLine());

        int cnt = 0;
        int cnt2 = 1;
        int idx = 0;

        while (true) {
            if (N==1) {
                idx = -1;
                break;
            }
            if (1+6*cnt < N && N <= 1+6*cnt2) {
                break;
            }
            cnt=cnt2;
            cnt2=cnt+2+idx++;
        }

        out.write(String.valueOf(idx+2));
        out.newLine();

        in.close();
        out.flush();
        out.close();
    }
}