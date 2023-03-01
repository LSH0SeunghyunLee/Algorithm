import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int tc = 1; tc <= 10; tc++) {
			br.readLine();
			char[] find = br.readLine().toCharArray();
			char[] total = br.readLine().toCharArray();
			
			int i = 0;
			int j = 0;
			
			int cnt = 0;
			
			while (i < total.length && j < find.length) {
				if (find[j] != total[i]) {
					i -= j;
					j = -1;
				}
				i++;
				j++;
				if (j == find.length) {
					cnt++;
					j = 0;
				}
			}
			
			bw.write("#" + tc + " " + cnt);
			bw.newLine();			
		}

		bw.flush();
		bw.close();
	}
}
