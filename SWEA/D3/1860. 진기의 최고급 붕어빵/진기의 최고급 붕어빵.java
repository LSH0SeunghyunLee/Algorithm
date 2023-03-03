import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
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
			int K = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[N];
			
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			int time = M;
			int cnt = K;
			int idx = 0;
			int flag = 1;
			
			while (idx < N) {
				if (arr[0] < M) {
					flag = 0;
					break;
				}
				
				if (time <= arr[idx] && arr[idx] < time + M) {
					cnt--;
					if (cnt < 0) {
						flag = 0;
						break;
					}
					idx++;
					continue;
				}
				
				time += M;
				cnt += K;
			}
			
			String msg = "Possible";
			
			if (flag == 0) msg = "Impossible";
			
			bw.write("#" + tc + " " + msg);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
