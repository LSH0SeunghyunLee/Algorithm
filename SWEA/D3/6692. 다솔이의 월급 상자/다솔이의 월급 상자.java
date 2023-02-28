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
			int N = Integer.parseInt(br.readLine());
			
			double sum = 0;
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				double a = Double.parseDouble(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				sum += a * b;
			}
			
			System.out.printf("#%d %6f", tc, sum);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
