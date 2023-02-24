import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= testcase; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			
			int fourfive = N/50000;
			N -= 50000 * fourfive;
			int fourone = N/10000;
			N -= 10000 * fourone;
			int threefive = N/5000;
			N -= 5000 * threefive;
			int threeone = N/1000;
			N -= 1000 * threeone;
			int twofive = N/500;
			N -= 500 * twofive;
			int twoone = N/100;
			N -= 100 * twoone;
			int onefive = N/50;
			N -= 50 * onefive;
			int oneone = N/10;
			N -= 10 * oneone;
			
			
			bw.write("#" + tc);
			bw.newLine();
			bw.write(fourfive + " " + fourone + " " + threefive + " " + threeone + " " + twofive + " " + twoone + " " + onefive + " " + oneone);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
