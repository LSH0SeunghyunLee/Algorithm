import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			List<Integer> list = new ArrayList<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < N; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			int M = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			
			int x = 0;
			int y = 0;
			int s = 0;
			
			bw.write("#" + tc + " ");
			
			int idx = 0;
			
			while (idx < M) {
				String a = st.nextToken();
				if (a.equals("I")) {
					x = Integer.parseInt(st.nextToken());
					y = Integer.parseInt(st.nextToken());
					for (int j = 0; j < y; j++) {
						s = Integer.parseInt(st.nextToken());
						list.add(x++, s);
					}
				} else if (a.equals("D")) {
					x = Integer.parseInt(st.nextToken());
					y = Integer.parseInt(st.nextToken());
					for (int i = 0; i < y; i++) {
						list.remove(x);
					}
				} else if (a.equals("A")) {
					y = Integer.parseInt(st.nextToken());
					for (int j = 0; j < y; j++) {
						s = Integer.parseInt(st.nextToken());
						list.add(s);
					}
				}
				idx++;
			}
			
			for (int i = 0; i < 10; i++) {
				bw.write(list.get(i) + " ");
			}
			
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
