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
			int N = Integer.parseInt(br.readLine());
			
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			
			int flag = 0;
			
			while (N != 1) {
				if (flag == 0) {
					try {
						if (N%2 !=0) throw new Exception();
						N /= 2;
						a++;
					} catch (Exception exception) {
						flag = 1;
						continue;
					}
				} else if (flag == 1) {
					try {
						if (N%3 !=0) throw new Exception();
						N /= 3;
						b++;
					} catch (Exception exception) {
						flag = 2;
						continue;
					}
				} else if (flag == 2) {
					try {
						if (N%5 !=0) throw new Exception();
						N /= 5;
						c++;
					} catch (Exception exception) {
						flag = 3;
						continue;
					}
				} else if (flag == 3) {
					try {
						if (N%7 !=0) throw new Exception();
						N /= 7;
						d++;
					} catch (Exception exception) {
						flag = 4;
						continue;
					}
				} else if (flag == 4) {
					try {
						if (N%11 !=0) throw new Exception();
						N /= 11;
						e++;
					} catch (Exception exception) {
						break;
					}
				}
			}
			
			bw.write("#" + tc + " " + a + " " + b + " " + c + " " + d + " " + e);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
