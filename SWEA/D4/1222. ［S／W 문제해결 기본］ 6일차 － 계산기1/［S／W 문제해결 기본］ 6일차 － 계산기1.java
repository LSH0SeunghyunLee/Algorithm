import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int tc = 1; tc <= 10; tc++) {
			br.readLine();
			
			String line = br.readLine();
			
			List<Integer> list = new ArrayList<>();
			
			for (int i = 0; i < line.length(); i++) {
				if (0 <= line.charAt(i)-48 && line.charAt(i)-48 <= 9) {
					list.add(line.charAt(i)-48);
				}
			}
			
			int value = 0;
			
			for (int i = 0; i < list.size(); i++) {
				value += list.get(i);
			}
			
			bw.write("#" + tc + " " + value);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
