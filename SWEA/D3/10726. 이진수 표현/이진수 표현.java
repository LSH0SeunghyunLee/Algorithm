import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static int M;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= testcase; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			int a = 1;
			int cnt = 0;
			int sum = 0;
			
			while (cnt < N) {
				sum += a;
				a *= 2;
				cnt++;
			}
			
			if (isBinary(M, sum)) bw.write("#" + tc + " " + "ON");
			else bw.write("#" + tc + " " + "OFF");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
	
	public static boolean isBinary(int M, int sum) {
		int b = 1;
		
		while (b*2 < M) {
			b *= 2;
		}
		
		while (b >= 1) {
			if (M - sum == 0) {
				return true;
			} else if (M - sum < 0) {
				return false;
			}
			
			if (M > b) {				
				M -= b;
			}
			
			b /= 2;
		}
		
		return false;
	}
}