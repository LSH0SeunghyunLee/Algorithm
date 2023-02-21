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
        
        int N = Integer.parseInt(in.readLine());
        
        for (int i = 0; i < N; i++) {
        	int sum = 0;
        	int temp = 0;
        	
        	for (int j = 0; j < 2; j++) {
        		StringTokenizer st = new StringTokenizer(in.readLine());	
            	
            	int K = Integer.parseInt(st.nextToken());
            	
            	for (int k = 0; k < K; k++) {
    				int molar = Integer.parseInt(st.nextToken());
    				if (molar == 4) {
    					sum += 11000000;
    				} else if (molar == 3) {
    					sum += 110000;
    				} else if (molar == 2) {
    					sum += 1100;
    				} else {
    					sum += 11;
    				}
    			}
            	if (j == 0) {
            		temp = sum;
            		sum = 0;
            	}
			}
        	if (temp > sum) out.write("A");
    		else if (temp == sum) out.write("D");
    		else out.write("B");
    		temp = 0;
    		out.newLine();
		}
    	
        in.close();
        out.flush();
        out.close();
    }
}
