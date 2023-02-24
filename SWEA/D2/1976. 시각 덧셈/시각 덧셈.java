import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= testcase; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int ahour = Integer.parseInt(st.nextToken());
			int aminute = Integer.parseInt(st.nextToken());
			int bhour = Integer.parseInt(st.nextToken());
			int bminute = Integer.parseInt(st.nextToken());
			
			int hour = ahour + bhour;
			int minute = aminute + bminute;
			
			if (minute >= 60) {
				hour++;
				minute %= 60;
			}
			if (hour % 12 != 0) hour %= 12;
			else if (hour / 12 > 1) hour -= 12;
			
			bw.write("#" + tc + " " + hour + " " + minute);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
