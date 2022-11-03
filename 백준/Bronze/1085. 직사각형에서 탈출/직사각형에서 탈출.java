import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Math.*;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int x = Integer.parseInt(tokenizer.nextToken());
        int y = Integer.parseInt(tokenizer.nextToken());
        int w = Integer.parseInt(tokenizer.nextToken());
        int h = Integer.parseInt(tokenizer.nextToken());

        int minxy = min(x, y);
        int minwh = min(w-x, h-y);
        int min = min(minxy, minwh);

        out.write(String.valueOf(min));

        in.close();
        out.flush();
        out.close();
    }
}