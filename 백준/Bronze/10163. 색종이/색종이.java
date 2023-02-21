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

        int[][] arr = new int[1001][1001];
        
        int N = Integer.parseInt(in.readLine());
        
        for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for (int j = x1; j < x1+x2; j++) {
				for (int k = y1; k < y1+y2; k++) {
					arr[j][k] = i;
				}
			}
		}
        
        int cnt = 0;
        
        for (int i = 1; i <= N; i++) {
        	for (int j = 0; j < 1001; j++) {
            	for (int k = 0; k < 1001; k++) {
            		if (arr[j][k] == i) {
            			cnt++;
            		}
    			}
    		}
        	out.write(String.valueOf(cnt));
        	out.newLine();
        	cnt = 0;
		}
        
        

        in.close();
        out.flush();
        out.close();
    }
}
