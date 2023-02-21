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
		
		int scnt = 0;
		int lcnt = 0;
		
		String line = br.readLine();
		
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'S') scnt++;
			else if (line.charAt(i) == 'L') lcnt++;
		}
		
		lcnt = lcnt/2;
		
		int cnt = lcnt + scnt + 1;
		
		if (cnt > num) cnt = num;
		
		bw.write(String.valueOf(cnt));
		bw.newLine();

		bw.flush();
		bw.close();
	}
}
