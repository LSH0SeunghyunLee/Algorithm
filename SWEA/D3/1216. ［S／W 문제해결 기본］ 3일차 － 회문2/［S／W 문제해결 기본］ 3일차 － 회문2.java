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
			
			char[][] arr = new char[100][100];
			
			for (int i = 0; i < 100; i++) {
				String line = br.readLine();
				for (int j = 0; j < 100; j++) {
					arr[i][j] = line.charAt(j);
				}
			}
			
			int max = 0;
			int cnt = 0;
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					Loop1:
					for (int k = 0; k < 100-j; k++) {
						int ridx = 0;
						int cidx = 0;
						int size = 100-k-j;
						while (true) {
							if (arr[i][j+ridx] == arr[i][99-k-ridx]) {
								if (99-k-j-2*ridx == 1 || 99-k-j-2*ridx == 0) {
									cnt = size;
									break Loop1;
								}
								ridx++;
							} else {
								break;
							}
						}
						while (true) {
							if (arr[j+cidx][i] == arr[99-k-cidx][i]) {
								if (99-k-j-2*cidx == 1 || 99-k-j-2*cidx == 0) {
									cnt = size;
									break Loop1;
								}
								cidx++;
							} else {
								break;
							}
						}
					}
					if (cnt > max) max = cnt;
				}
			}
			
			bw.write("#" + tc + " " + max);
			bw.newLine();			
		}

		bw.flush();
		bw.close();
	}
}
