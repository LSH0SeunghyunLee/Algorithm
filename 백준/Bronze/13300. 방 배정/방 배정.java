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
        
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[6][2];
        
        for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine());
			
			int gender = Integer.parseInt(st.nextToken());
			int grade = Integer.parseInt(st.nextToken());
			
			arr[grade-1][gender]++;
		}
        
        int sum = 0;
        
        for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 2; j++) {
				if (arr[i][j] != 0) {
					if (arr[i][j] > K) {
						sum += (arr[i][j] - 1) / K + 1;
					} else {
						sum++;
					}
				}
			}
		}
        
    	out.write(String.valueOf(sum));
    	
        in.close();
        out.flush();
        out.close();
    }
}
