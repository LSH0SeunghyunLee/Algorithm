import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testcase = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= testcase; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				String line = br.readLine();
				for (int j = 0; j < N; j++) {
					arr[i][j] = line.charAt(j) - 48;
				}
			}
			
			int max = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = Math.abs(N/2 - i); j <= N - 1 - Math.abs(N/2 - i); j++) {
					max += arr[i][j];
				}
			}
			
			bw.write("#" + tc + " " + max);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
