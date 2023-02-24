import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < testcase; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int cnt = 0;
			
			for (int i = 0; i < N; i++) {
				int rowFlag = 1;
				int rowMax = 0;
				int colFlag = 1;
				int colMax = 0;
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 1) {
						rowMax++;
						if (rowMax == K) rowFlag = 0;
					} else {
						rowMax = 0;
						rowFlag = 1;
					}
					if (arr[j][i] == 1) {
						colMax++;
						if (colMax == K) colFlag = 0;
					} else {
						colMax = 0;
						colFlag = 1;
					}
					
					if (rowFlag == 0 && rowMax == K) {
						cnt++;
					} else if (rowFlag == 0 && rowMax != K) {
						cnt--;
						rowFlag = 1;
					}
					if (colFlag == 0 && colMax == K) {
						cnt++;
					} else if (colFlag == 0 && colMax != K) {
						cnt--;
						colFlag = 1;
					}
				}
			}
			
			System.out.println("#" + (tc+1) + " " + cnt);
		}
	}
}
