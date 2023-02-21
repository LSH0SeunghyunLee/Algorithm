import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(in.readLine());

        // 카드의 개수
        int N = Integer.parseInt(st.nextToken());
        // 목표 점수
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(in.readLine());
        
        int[] arr = new int[N];
        
        // 카드 입력
        for (int i = 0; i < N; i++) {	
            int num = Integer.parseInt(st.nextToken());
            if (num > M) {
            	continue;
            } else {
            	arr[i] = num;
            }
        }

        int min = Integer.MAX_VALUE;
        int temp = 0;
        int sum = 0;
        
        // 숫자 3개의 합 중 최소값일 때의 합 찾기
        for (int i = N-1; i >= 0; i--) {
            for (int j = i-1; j >= 0; j--) {
            	for (int k = 0; k < j; k++) {
            		temp = arr[i] + arr[j] + arr[k];
            		if (M-temp < 0) continue;
					if (M - temp < min) {
						min = M - temp;
						sum = temp;
					}
				}
            }
        }

        out.write(String.valueOf(sum));
        out.newLine();

        in.close();
        out.flush();
        out.close();
    }
}
