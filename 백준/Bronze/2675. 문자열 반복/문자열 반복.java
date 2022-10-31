import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(in.readLine());

        for (int i = 0; i < A; i++) {
            StringTokenizer tokenizer = new StringTokenizer(in.readLine());

            int B = Integer.parseInt(tokenizer.nextToken());

            String C = tokenizer.nextToken();

            char[] charList = C.toCharArray();

            for (int j = 0; j < charList.length; j++) {
                for (int k = 0; k < B; k++) {
                    out.write(charList[j]);
                }
            }
            
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}