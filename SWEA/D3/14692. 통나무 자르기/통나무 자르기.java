import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < tc; i++) {
			int a = Integer.parseInt(br.readLine());
			String person = "Alice";
			if (a % 2 == 1) {
				person = "Bob";
			}
			System.out.println("#" + (i+1) + " " + person);
		}
	}
}
