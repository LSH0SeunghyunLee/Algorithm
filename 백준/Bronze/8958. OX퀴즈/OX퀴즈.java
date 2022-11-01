import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(in.readLine());

        for (int i = 0; i < A; i++) {
            String B = in.readLine();

            int C = 0;
            int D = 0;

            for (int j = 0; j < B.length(); j++) {
                if (B.charAt(j) == 'O') {
                    C++;
                    D += C;
                } else {
                    C = 0;
                }
            }
            System.out.println(D);
        }

        in.close();
    }
}