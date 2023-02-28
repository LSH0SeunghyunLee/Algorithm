import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < testcase; tc++) {
			String line = br.readLine();
			
			String msg = "YES";
			
			char[] arr = new char[line.length()];
			
			int cnt = 0;
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = line.charAt(i);
				if (arr[i] == 'x') {
					cnt++;
				}
			}
			
			if (cnt > 7) {
				msg = "NO";
			}
			
			System.out.println("#" + (tc+1) + " " + msg);
		}
	}
}
