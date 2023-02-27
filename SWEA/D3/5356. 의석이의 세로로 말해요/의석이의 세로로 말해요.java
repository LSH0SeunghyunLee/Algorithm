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
			String[] arr = new String[5];
			
			int max = 0;
			
			for (int i = 0; i < 5; i++) {
				arr[i] = br.readLine();
				if (arr[i].length() > max) max = arr[i].length();
			}
			
			bw.write("#" + tc + " ");
			
			for (int i = 0; i < max; i++) {
				for (int j = 0; j < 5; j++) {
					if (i <= arr[j].length()-1) {
						bw.write(arr[j].charAt(i));
					}
				}
			}
			
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
