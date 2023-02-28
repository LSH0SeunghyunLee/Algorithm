import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int tc = 0; tc < 10; tc++) {
			br.readLine();
			
			int[][] arr = new int[100][100];
			
			int max = 0;
			
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int rowSum = 0;
				for (int j = 0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					rowSum += arr[i][j];
				}
				if (rowSum > max) max = rowSum;
			}
			
			for (int i = 0; i < 100; i++) {
				int colSum = 0;
				for (int j = 0; j < 100; j++) {
					colSum += arr[j][i];
				}
				if (colSum > max) max = colSum;
			}
			
			int tSum = 0;
			int bSum = 0;
			
			for (int i = 0; i < 100; i++) {
				tSum += arr[i][i];
				bSum += arr[99-i][i];
			}
			
			if (tSum > max) max = tSum;
			if (bSum > max) max = bSum;
			
			System.out.println("#" + (tc+1) + " " + max);
		}
	}
}
