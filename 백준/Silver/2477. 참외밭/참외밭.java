import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(in.readLine());

        int maxR = 0;
        int maxC = 0;
        int rIdx = 0;
        int cIdx = 0;

        int[][] temp = new int[6][2];

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int direction = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());

            temp[i][0] = direction;
            temp[i][1] = length;

            if (direction >= 3) {
                if (length > maxR) {
                    maxR = length;
                    rIdx = i;
                }
            } else {
                if (length > maxC) {
                    maxC = length;
                    cIdx = i;
                }
            }
        }

        int size = maxR * maxC - temp[(rIdx + 3) % 6][1] * temp[(cIdx + 3) % 6][1];

        out.write(String.valueOf(size * N));
        out.newLine();

        in.close();
        out.flush();
        out.close();
    }
}