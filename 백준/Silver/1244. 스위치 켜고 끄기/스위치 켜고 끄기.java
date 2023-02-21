import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int switchNum = Integer.parseInt(br.readLine());
		
		int[] arr = new int[switchNum+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= switchNum; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());
			
			int gender = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());
			
			if (gender == 1) {
				for (int j = 1; j <= switchNum/idx; j++) {
					arr[idx*j] = Math.abs(arr[idx*j]-1);
				}
			} else {
				arr[idx] = Math.abs(arr[idx]-1);
				if (idx <= switchNum/2) {
					for (int j = 1; j < idx; j++) {
						if (arr[idx-j] == arr[idx+j]) {
							arr[idx+j] = Math.abs(arr[idx+j]-1);
							arr[idx-j] = Math.abs(arr[idx-j]-1);
						} else {
							break;
						}
					}
				} else {
					for (int j = 1; j <= switchNum-idx; j++) {
						if (arr[idx-j] == arr[idx+j]) {
							arr[idx+j] = Math.abs(arr[idx+j]-1);
							arr[idx-j] = Math.abs(arr[idx-j]-1);
						} else {
							break;
						}
					}
				}
			}
		}
		
		for (int i = 1; i <= switchNum; i++) {
			bw.write(String.valueOf(arr[i]));
			if (i%20 == 0) {
				bw.newLine();
			} else {
				bw.write(" ");
			}
		}
		
		bw.flush();
		bw.close();
	}
}
