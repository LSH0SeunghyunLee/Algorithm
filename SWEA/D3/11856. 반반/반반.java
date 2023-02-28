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
			String line = br.readLine();
			
			int[] arr = new int[26];
			
			for (int i = 0; i < 4; i++) {
				arr[line.charAt(i) - 65]++;
			}
			
			String msg = "Yes";
			
			int cnt = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					cnt++;
					if (arr[i] != 2) msg = "No";
				}
			}
			
			if (cnt != 2) msg = "No"; 
			
			bw.write("#" + tc + " " + msg);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
