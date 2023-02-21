import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(in.readLine());
        
        int[] arr = new int[L+1];
        
        int N = Integer.parseInt(in.readLine());
        
        int expectedmax = 0;
        int expectedMaxIdx = 0;
        
        for (int i = 1; i <= N; i++) {
        	StringTokenizer st = new StringTokenizer(in.readLine());
        	int P = Integer.parseInt(st.nextToken());
        	int K = Integer.parseInt(st.nextToken());
        	
        	if (K - P > expectedmax) {
        		expectedmax = K - P;
        		expectedMaxIdx = i;
        	}
        	
        	for (int j = P; j <= K; j++) {
				if (arr[j] == 0) {
					arr[j] = i;
				}
			}
		}
        
        int max = 0;
        int maxIdx = 0;
        int cnt = 0;
        
        for (int i = 1; i <= N; i++) {
			for (int j = 0; j < L+1; j++) {
				if (arr[j] == i) {
					cnt++;
				}
			}
			if (cnt > max) {
				max = cnt;
				maxIdx = i;
			}
			cnt = 0;
		}
        
        out.write(String.valueOf(expectedMaxIdx));
        out.newLine();
        out.write(String.valueOf(maxIdx));

        in.close();
        out.flush();
        out.close();
    }
}
