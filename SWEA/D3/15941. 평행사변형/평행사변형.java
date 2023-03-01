import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < a; i++) {
			int b = Integer.parseInt(br.readLine());
			System.out.println("#" + (i+1) + " " + b*b);
		}
	}
}
