import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testcase = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= testcase; tc++) {
			int N = Integer.parseInt(br.readLine());

			int totalCnt = 1;
			int sum = 0;
			int max = 0;
			int min = 1;
			
			for (int i = 1; i <= N/2; i++) {
				sum += i;
				if (sum >= N) {
					max = i-1;
					sum -= i;
					break;
				}
			}
			
			if (sum == N) totalCnt++;
			
			while (max > min) {
				sum += ++max;
				while (sum > N) {
					sum -= min;
					min++;
				}
				if (sum == N) totalCnt++;
			}
			

			bw.write("#" + tc + " " + totalCnt);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
