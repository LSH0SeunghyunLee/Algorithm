import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testcase = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= testcase; tc++) {
			String line = br.readLine();

			char[] arr = new char[line.length()];
			
			for (int i = 0; i < line.length(); i++) {
				arr[i] = line.charAt(i);
			}
			
			int n = 0;

			Loop:
			for (int i = 0; i < line.length(); i++) {
				if (arr[i] == arr[0]) {
					for (int j = 1; j < i; j++) {
						if (arr[i+j] != arr[j]) {
							break;
						}
						if (j == i-1) {
							n = i;
							break Loop;
						}
					}
				}
			}

			bw.write("#" + tc + " " + n);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
