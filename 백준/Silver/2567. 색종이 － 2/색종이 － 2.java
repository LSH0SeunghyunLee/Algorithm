import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(in.readLine());

        // 흰색 도화지를 위한 배열 생성
        int[][] arr = new int[102][102];

        // K개의 색종이의 좌하단 좌표를 통해 색종이의 넓이에 대한 부분을 1로 채운다.
        for (int i = 0; i < K; i++) {
            StringTokenizer tokenizer = new StringTokenizer(in.readLine());

            // 좌표
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());

            // 색종이 넓이 부분을 1로 변환
            for (int j = x+1; j < x+11; j++) {
                for (int k = y+1; k < y+11; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int cnt = 0;

        // 스스로가 1인 녀석 중 주변이 0이라면 변이다!
        // 2개면 꼭짓점으로 2개를 더해줘야한다.
        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
            	if (arr[i][j] == 1) {
            		if (arr[i+1][j] == 0) {
                    	cnt++;
                    }
            		if (arr[i][j+1] == 0) {
            			cnt++;
            		}
            		if (arr[i-1][j] == 0) {
            			cnt++;
            		}
            		if (arr[i][j-1] == 0) {
            			cnt++;
            		}
            	}
            }
        }

        out.write(String.valueOf(cnt));
        out.newLine();

        in.close();
        out.flush();
        out.close();
    }
}
