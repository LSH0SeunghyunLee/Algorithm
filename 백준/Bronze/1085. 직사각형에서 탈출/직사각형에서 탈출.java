import java.io.*;
import java.util.*;

public class Main {
    static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        min = Integer.MAX_VALUE;

        min = Math.min(Math.min(w-x, x), Math.min(h-y, y));

        bw.write(min + "");
        bw.flush();
        bw.close();
    }
}