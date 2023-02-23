import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        r++;
        c++;

        int arraySize = 1;

        for (int i = 0; i < N; i++) {
            arraySize *= 2;
        }

        int start = 0;
        int rStart = 1;
        int cStart = 1;
        int rEnd = arraySize;
        int cEnd = arraySize;

        int flag;

        while (true) {
            if (rStart <= r && r <= rEnd - arraySize/2 && cStart <= c && c <= cEnd - arraySize/2) {
                rEnd -= arraySize/2;
                cEnd -= arraySize/2;
                flag = 0;
            } else if (rStart <= r && r <= rEnd - arraySize/2 && cStart + arraySize/2 <= c && c <= cEnd) {
                rEnd -= arraySize/2;
                cStart += arraySize/2;
                flag = 1;
            } else if (rStart + arraySize/2 <= r && r <= rEnd && cStart <= c && c <= cEnd - arraySize/2) {
                rStart += arraySize/2;
                cEnd -= arraySize/2;
                flag = 2;
            } else {
                rStart -= arraySize/2;
                cStart -= arraySize/2;
                flag = 3;
            }

            start += ((arraySize * arraySize) / 4) * flag;

            arraySize /= 2;

            if (arraySize == 1) break;
        }

        out.write(String.valueOf(start));
        out.newLine();

        in.close();
        out.flush();
        out.close();
    }
}