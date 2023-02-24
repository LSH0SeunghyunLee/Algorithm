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
		
		int testcase = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= testcase; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int[] arrA = new int[a];
			int[] arrB = new int[b];
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < a; i++) {
				arrA[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < b; i++) {
				arrB[i] = Integer.parseInt(st.nextToken());
			}
			
			int max = 0;
			int sum = 0;
			
			if (a >= b) {
				for (int i = 0; i <= a - b; i++) {
					for (int j = 0; j < b; j++) {
						sum += arrA[j+i] * arrB[j];
					}
					if (sum > max) max = sum;
					sum = 0;
				}
			} else {
				for (int i = 0; i <= b - a; i++) {
					for (int j = 0; j < a; j++) {
						sum += arrA[j] * arrB[j+i];
					}
					if (sum > max) max = sum;
					sum = 0;
				}
			}
			
			bw.write("#" + tc + " " + max);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
