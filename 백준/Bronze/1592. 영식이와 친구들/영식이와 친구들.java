import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		int idx = 0;
		int cnt = 0;
		
		while (true) {
			if (arr[idx] % 2 == 0) {
				if (idx - L >= 0) {
					idx -= L;
					cnt++;
					arr[idx]++;
				} else {
					idx = N - L + idx;
					cnt++;
					arr[idx]++;
				}
			} else {
				idx = (idx + L) % N;
				cnt++;
				arr[idx]++;
			}
			if (arr[idx] == M) {
				break;
			}
		}
		
		bw.write(String.valueOf(cnt-1));
		
		bw.flush();
		bw.close();
	}
}
