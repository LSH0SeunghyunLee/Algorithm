import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());
        
        for (int tc = 0; tc < testcase; tc++) {
        	String line = in.readLine();
            
            char[] arr = line.toCharArray();
            
            int sum = 0;
            int cnt = 0;
            
            for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 'O') {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0;
				}
			}
            
            out.write(String.valueOf(sum));
            out.newLine();
		}

        in.close();
        out.flush();
        out.close();
    }
}
