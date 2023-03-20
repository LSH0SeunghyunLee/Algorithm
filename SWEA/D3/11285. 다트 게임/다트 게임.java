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
		
		int testcase = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= testcase; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int result = 0;
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				double r = Math.sqrt(x*x + y*y);
				
				if (r <= 20) result += 10;
				else if (r <= 40) result += 9;
				else if (r <= 60) result += 8;
				else if (r <= 80) result += 7;
				else if (r <= 100) result += 6;
				else if (r <= 120) result += 5;
				else if (r <= 140) result += 4;
				else if (r <= 160) result += 3;
				else if (r <= 180) result += 2;
				else if (r <= 200) result += 1;
			}
			
			bw.write("#" + tc + " " + result);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}