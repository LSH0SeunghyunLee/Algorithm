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
			br.readLine();
			
			int[] arr = new int[101];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int max = 0;
			int maxIdx = 0;
			
			for (int i = 0; i < 1000; i++) {
				arr[Integer.parseInt(st.nextToken())]++;
			}
			
			for (int i = 0; i < 100; i++) {
				if (arr[i] >= max) {
					max = arr[i];
					maxIdx = i;
				}
			}
			
			bw.write("#" + tc + " " + maxIdx);
			
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
