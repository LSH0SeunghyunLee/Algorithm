import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testcase = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= testcase; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int cnt = 0;
			
			while (true) {
				cnt++;
				if ((cnt - S) % 365 == 0 && (cnt - E) % 24 == 0 && (cnt - M) % 29 == 0) break;
			}
			
			bw.write("#" + tc + " " + cnt);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
