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
			bw.write("#" + tc);
			bw.newLine();
			int N = Integer.parseInt(br.readLine());
			
			int idx = 0;
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				String start = st.nextToken();
				int count = Integer.parseInt(st.nextToken());
				for (int j = 0; j < count; j++) {
					bw.write(start);
					idx++;
					if (idx % 10 == 0) bw.newLine();
				}
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
