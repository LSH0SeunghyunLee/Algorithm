import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num; j++) {
				if (i*j <= num) cnt++;
			}
		}

		bw.write(String.valueOf(cnt));
		bw.newLine();

		bw.flush();
		bw.close();
	}
}
