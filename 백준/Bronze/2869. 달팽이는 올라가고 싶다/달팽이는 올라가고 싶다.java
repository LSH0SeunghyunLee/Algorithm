import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static long A, B, V, sum, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        sum = 0;

        sum = (V - B) / (A - B);

        if ((V -B) % (A - B) != 0) sum++;

        bw.write(sum + "");

        bw.flush();
        bw.close();
    }
}
