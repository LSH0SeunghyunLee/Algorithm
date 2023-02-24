import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= testcase; tc++) {
			int num = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[num][num];
			
			int cnt = 1;
			int row = 0;
			int col = 0;
			int number = num-1;
			
			while (number >= 0) {
				for (int i = 0; i < number; i++) arr[row][col+i] = cnt++;
				for (int i = 0; i < number; i++) arr[row+i][num-col-1] = cnt++;
				for (int i = 0; i < number; i++) arr[num-row-1][num-col-1-i] = cnt++;
				for (int i = 0; i < number; i++) arr[num-row-1-i][col] = cnt++;
				row++;
				col++;
				number -= 2;
				if (number < 1) {
					if (num % 2 == 1) arr[num/2][num/2] = cnt;
					else break;
				}
			}
			
			System.out.println("#" + tc + " ");
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
