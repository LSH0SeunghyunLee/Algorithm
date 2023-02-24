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
			char[] total = br.readLine().toCharArray();
			
			int answer = 0;
			
			for (int i = 0; i < total.length/2 + total.length%2; i++) {
				if (total[i] == total[total.length-1-i]) {
					answer = 1;
				} else {
					answer = 0;
					break;
				}
			}
			
			bw.write("#" + tc + " " + answer);
			bw.newLine();			
		}

		bw.flush();
		bw.close();
	}
}
