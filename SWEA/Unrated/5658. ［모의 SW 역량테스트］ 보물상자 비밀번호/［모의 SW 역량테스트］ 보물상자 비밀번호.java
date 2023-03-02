import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testcase = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= testcase; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			String line = br.readLine();
			
			Stack<Character> stack = new Stack<>();
			Queue<Character> queue = new LinkedList<>();
			
			for (int i = 0; i < N; i++) {
				stack.push(line.charAt(i));
			}
			
			for (int i = 0; i < N; i++) {
				queue.offer(stack.pop());
			}
			
			Set<Integer> set = new HashSet<>();
			
			int cnt = 0;
			
			while (cnt < N/4) {
				for (int i = 0; i < 4; i++) {
					int sum = 0;
					for (int j = 0; j < N/4; j++) {
						char temp = queue.poll();
						queue.offer(temp);
						int multiplied = 1;
						for (int l = 0; l < j; l++) {
							multiplied *= 16;
						}
						if ('0' <= temp && temp <= '9') sum += (temp-48) * multiplied;
						else sum += (temp-55) * multiplied;
					}
					set.add(sum);
				}
				char next = queue.poll();
				queue.offer(next);
				cnt++;
			}
			
			List<Integer> list = new ArrayList<>(set);
			
			Collections.sort(list);
			
			bw.write("#" + tc + " " + list.get(list.size() - K));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
