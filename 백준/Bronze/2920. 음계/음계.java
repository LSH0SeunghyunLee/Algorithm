import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int[] array = new int[8];

        String result = "";

        for (int i = 0; i < 8; i++) {
            array[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for (int i = 0; i < 7; i++) {
            if (array[i] == array[i + 1] - 1) {
                result = "ascending";
            } else if (array[i] == array[i + 1] + 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }

        out.write(result);

        in.close();
        out.flush();
        out.close();
    }
}