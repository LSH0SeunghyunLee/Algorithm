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
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int student = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
			
			int value = 0;
			
			int[] arr = new int[student];
			
			for (int i = 0; i < student; i++) {
				st = new StringTokenizer(br.readLine());
				
				int a = Integer.parseInt(st.nextToken()) * 35;
				int b = Integer.parseInt(st.nextToken()) * 45;
				int c = Integer.parseInt(st.nextToken()) * 20;
				
				if (i+1 == k) {
					value = a + b + c;
				}
				
				arr[i] = a + b + c;
			}
			
			Arrays.sort(arr);
			
			String result = "";
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == value) {
					value = i;
					value /= student/10;
					result = grade[9-value];
					break;
				}
			}
			
			bw.write("#" + tc + " " + result);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
