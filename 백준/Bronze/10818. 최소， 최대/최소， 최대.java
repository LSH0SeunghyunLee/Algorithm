import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
		int A = Integer.parseInt(in.readLine());
        
		StringTokenizer tokenizer = new StringTokenizer(in.readLine());
        
		in.close();

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < A; i++) {
			int num = Integer.parseInt(tokenizer.nextToken());
			max = Math.max(max, num);
			min = Math.min(min, num);
		}

		System.out.println(min + " " + max);
	}
}