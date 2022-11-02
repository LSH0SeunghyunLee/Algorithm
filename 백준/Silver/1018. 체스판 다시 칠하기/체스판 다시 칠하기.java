import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    static boolean[][] arr;
    static int min = 64;

    public static void main(String[] args) throws IOException {
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int A = Integer.parseInt(tokenizer.nextToken());
        int B = Integer.parseInt(tokenizer.nextToken());

        arr = new boolean[A][B];

        for (int i = 0; i < A; i++) {
            String arrayLine = in.readLine();

            for (int j = 0; j < B; j++) {
                if (arrayLine.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        for (int i = 0; i < A - 7; i++) {
            for (int j = 0; j < B - 7; j++) {
                find(i, j);
            }
        }
        
        out.write(String.valueOf(min));

        in.close();
        out.flush();
        out.close();
    }

    public static void find(int x, int y) {
        boolean arrTF = arr[x][y];

        int C = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (arr[i][j] != arrTF) {
                    C++;
                }
                arrTF = (!arrTF);
            }
            arrTF = !arrTF;
        }
        C = Math.min(C, 64 - C);

        min = Math.min(min, C);
    }
}