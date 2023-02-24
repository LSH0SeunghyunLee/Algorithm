import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= testcase; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int number = N;
			
			int[] arr = new int[10];
			
			int cnt = 0;
			int sum = 0;
			
			while (true) {
				String num = String.valueOf(N);
				for (int i = 0; i < num.length(); i++) {
					arr[num.charAt(i)-48]++;
				}
				for (int j = 0; j < 10; j++) {
					if (arr[j] == 0) cnt++;
				}
				if (cnt != 0) {
					sum++;
					N = number * (sum+1);
					cnt = 0;
				} else {
					sum++;
					break;
				}
			}
			
			bw.write("#" + tc + " " + number * sum);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
