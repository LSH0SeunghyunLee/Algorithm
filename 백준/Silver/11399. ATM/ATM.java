import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(in.readLine());
        
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int[] arr = new int[N];
        
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
        	arr[i] =  Integer.parseInt(st.nextToken());
		}
        
        Arrays.sort(arr);
        
        for (int i = 0; i < N; i++) {
			sum += arr[i];
			arr[i] = sum;
		}
        
        sum = 0;
        
        for (int i = 0; i < N; i++) {
			sum += arr[i];
		}
        
    	out.write(String.valueOf(sum));
    	out.newLine();
    	
        in.close();
        out.flush();
        out.close();
    }
}
