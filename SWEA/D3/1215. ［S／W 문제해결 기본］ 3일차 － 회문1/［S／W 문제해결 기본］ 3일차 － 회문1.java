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
			int length = Integer.parseInt(br.readLine());
			
			char[][] arr = new char[8][8];
			
			for (int i = 0; i < 8; i++) {
				String line = br.readLine();
				for (int j = 0; j < 8; j++) {
					arr[i][j] = line.charAt(j);
				}
			}
			
			int cnt = 0;
			
			int rcnt = 0;
			int ccnt = 0;
			
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					for (int k = 0; k < (length / 2) + (length % 2); k++) {
						if (j+length-1 < 8 && arr[i][j+k] == arr[i][j+length-k-1]) rcnt++;
						if (i+length-1 < 8 && arr[i+k][j] == arr[i+length-k-1][j]) ccnt++;
					}
					if (((rcnt * 2) - (length % 2)) == length)  {
						cnt++;
					}
					if (((ccnt * 2) - (length % 2)) == length) {
						cnt++;
					}
					rcnt = 0;
					ccnt = 0;
				}
			}
			
			bw.write("#" + tc + " " + cnt);
			bw.newLine();			
		}

		bw.flush();
		bw.close();
	}
}
