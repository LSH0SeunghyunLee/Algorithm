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
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			char[][] arr = new char[N][M];
			
			for (int i = 0; i < N; i++) {
				String line = br.readLine();
				for (int j = 0; j < M; j++) {
					arr[i][j] = line.charAt(j);
				}
			}
			
			// 최소값을 구해야 하므로 최댓값으로 초기화하고 시작
			int min = Integer.MAX_VALUE;
			
			// b : 파란색이 시작되는 idx
			// r : 빨간색이 시작되는 idx
			// i : 2차원 배열의 행의 idx
			// j : 2차원 배열의 열의 idx
			
			// 완전 탐색
			for (int i = 1; i < N - 1; i++) {
				for (int j = 2; j < N; j++) {
					// b, r이 정해질 때마다 세 구간이 정해지고
					// 새 구간마다 카운트를 해야 함
					int cnt = 0;
					
					// [0, i)
					for (int k = 0; k < i; k++) {
						for (int l = 0; l < M; l++) {
							if (arr[k][l] != 'W') cnt++;
						}
					}
					
					// [i, j)
					for (int k = i; k < j; k++) {
						for (int l = 0; l < M; l++) {
							if (arr[k][l] != 'B') cnt++;
						}
					}
					
					// [j, N)
					for (int k = j; k < N; k++) {
						for (int l = 0; l < M; l++) {
							if (arr[k][l] != 'R') cnt++;
						}
					}
					
					// 다른 것의 개수가 다 세어진 상황
					// 최소값인지 판단하고 갱신
					if (cnt < min) min = cnt;
				}
			}
			
			bw.write("#" + tc + " " +  min);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
