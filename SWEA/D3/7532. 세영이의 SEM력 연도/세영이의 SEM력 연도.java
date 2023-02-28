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
				int initS = cnt % 365;
				int initE = cnt % 24;
				int initM = cnt % 29;
				if (initS == 0) initS = 365;
				if (initE == 0) initE = 24;
				if (initM == 0) initM = 29;
				if (initS == S && initE == E && initM == M) break;
			}
			
			bw.write("#" + tc + " " + cnt);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
