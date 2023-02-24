import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			String tsn = String.valueOf(i);
			int flag = 0;
			for (int j = 0; j < tsn.length(); j++) {
				if (tsn.charAt(j) == '3') {
					flag++;
				} else if (tsn.charAt(j) == '6') {
					flag++;
				} else if (tsn.charAt(j) == '9') {
					flag++;
				}
			}
			
			if (flag == 0) {
				bw.write(String.valueOf(i));
			} else {
				for (int j = 0; j < flag; j++) {
					bw.write("-");
				}
			}
			
			bw.write(" ");
			
			flag = 0;
		}

		bw.flush();
		bw.close();
	}
}
