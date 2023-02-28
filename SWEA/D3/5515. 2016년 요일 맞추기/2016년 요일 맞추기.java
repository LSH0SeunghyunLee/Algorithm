import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] weekArr = {4, 5, 6, 0, 1, 2, 3};
		int[] monthArr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int testcase = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= testcase; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			
			for (int i = 1; i < m; i++) {
				sum += monthArr[i-1];
			}
			
			sum += d - 1;
			
			int week = sum % 7;
			int result = weekArr[week];
			
			bw.write("#" + tc + " " + result);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
