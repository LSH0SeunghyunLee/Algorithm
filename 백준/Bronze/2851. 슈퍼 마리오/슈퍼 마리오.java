import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];
        
        for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}

        int sum = 0;
        int temp = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < 10; i++) {
        	temp += arr[i];
			if (Math.abs(100 - temp) <= min) {
				min = Math.abs(100 - temp);
				sum = temp;
			}
		}

        out.write(String.valueOf(sum));
        out.newLine();

        in.close();
        out.flush();
        out.close();
    }
}
