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
		
		for (int tc = 0; tc < 4; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[8];
			
			for (int i = 0; i < 8; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int aFlag = 0;
			int bcFlag = 0;
			
			if (arr[2] > arr[4] && arr[0] < arr[6]) {
				if (arr[3] > arr[5] && arr[1] < arr[7]) {
					aFlag = 1;
				}
			}
			
			if (arr[2] == arr[4]) {
				if (arr[3] > arr[5] && arr[1] < arr[7]) {
					bcFlag = 1;
				} else if (arr[3] == arr[5] || arr[1] == arr[7]) {
					bcFlag = 2;
				}
			} else if (arr[0] == arr[6]) {
				if (arr[3] > arr[5] && arr[1] < arr[7]) {
					bcFlag = 1;
				} else if (arr[3] == arr[5] || arr[1] == arr[7]) {
					bcFlag = 2;
				}
			} else if (arr[3] == arr[5]) {
				if (arr[0] < arr[6] && arr[2] > arr[4]) {
					bcFlag = 1;
				} else if (arr[3] == arr[5] || arr[1] == arr[7]) {
					bcFlag = 2;
				}
			} else if (arr[1] == arr[7]) {
				if (arr[0] < arr[6] && arr[2] > arr[4]) {
					bcFlag = 1;
				} else if (arr[3] == arr[5] || arr[1] == arr[7]) {
					bcFlag = 2;
				}
			}
			
			String result = null;
			
			if (aFlag == 1) result = "a";
			else if (bcFlag == 1) result = "b";
			else if (bcFlag == 2) result = "c";
			else result = "d";
			
			bw.write(result);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
