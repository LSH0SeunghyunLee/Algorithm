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
			
			int S = Integer.parseInt(st.nextToken()) - 1;
			int E = Integer.parseInt(st.nextToken()) - 1;
			int M = Integer.parseInt(st.nextToken()) - 1;
			
			while (S % 24 != E || S % 29 != M) {
				S += 365;
			}
			
			bw.write("#" + tc + " " + (S + 1));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
