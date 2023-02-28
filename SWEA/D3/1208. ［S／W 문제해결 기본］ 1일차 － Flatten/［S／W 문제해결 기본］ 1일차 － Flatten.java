import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		for (int tc = 0; tc < 10; tc++) {
			int dump = Integer.parseInt(br.readLine());
			
			int[] arr = new int[100];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < 100; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			for (int i = 0; i < dump; i++) {
				arr[99]--;
				arr[0]++;
				Arrays.sort(arr);
			}
			
			System.out.println("#" + (tc+1) + " " + (arr[99] - arr[0]));
		}		
	}
}
