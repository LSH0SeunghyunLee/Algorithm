import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testcase = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= testcase; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			Queue<String> queue1 = new LinkedList<>();
			Queue<String> queue2 = new LinkedList<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < N; i++) {
				if (i < N / 2 + N % 2) {
					queue1.offer(st.nextToken());
				} else {
					queue2.offer(st.nextToken());
				}
			}
			
			bw.write("#" + tc + " ");
			
			int size = queue2.size();
			
			for (int i = 0; i < size; i++) {
				bw.write(queue1.poll() + " ");
				bw.write(queue2.poll() + " "); 
			}
			
			if (queue1.size() > 0) bw.write(queue1.poll() + " ");
			
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
