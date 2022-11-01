import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[42];

        int count = 0;
        
        for (int i = 0; i < 10; i++) {
            int A = Integer.parseInt(in.readLine());
            int B = A % 42;
            array[B]++;
        }

        for (int i = 0; i < 42; i++) {
            if (array[i] != 0) {
                count++;
            }
        }

        out.write(String.valueOf(count));

        in.close();
        out.flush();
        out.close();
    }
}