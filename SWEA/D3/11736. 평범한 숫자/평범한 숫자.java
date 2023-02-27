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

			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int cnt = 0;

			for (int i = 1; i < N - 1; i++) {
				if (arr[i-1] < arr[i] && arr[i] < arr[i+1]) cnt++;
				if (arr[i-1] > arr[i] && arr[i] > arr[i+1]) cnt++;
				else continue;
			}
			
			bw.write("#" + tc + " " + cnt);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
