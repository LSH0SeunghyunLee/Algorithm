import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = in.readLine();
        
        int r = 0;
        int c = 0;
        
        for (int i = 1; i <= line.length(); i++) {
			for (int j = i; j <= line.length(); j++) {
				if (i * j == line.length()) {
					r = i;
					c = j;
					break;
				}
			}
		}
        
        char[] arr = line.toCharArray();
        
        for (int i = 0; i < r; i++) {
        	for (int j = 0; j < line.length(); j+=r) {
        		out.write(arr[j+i]);
			}
		}

        in.close();
        out.flush();
        out.close();
    }
}
