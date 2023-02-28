import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < tc; i++) {
			String a = br.readLine();
			int cnt = 0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == '(') {
					if (a.charAt(j+1) == ')') {
						continue;
					} else {
						cnt++;
					}
				} else if (a.charAt(j) == ')') {
					cnt++;
				}
			}

			System.out.println("#" + (i+1) + " " + cnt);
		}
	}
}
