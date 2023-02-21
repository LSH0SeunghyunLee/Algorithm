import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        List<Character> zero = new ArrayList<>(Arrays.asList('C', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));
        List<Character> one = new ArrayList<>(Arrays.asList('A', 'D', 'O', 'P', 'Q', 'R'));
        List<Character> two = new ArrayList<>(Arrays.asList('B'));

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            String msg = "DIFF";

            String front = st.nextToken();
            String back = st.nextToken();

            if (front.length() != back.length()) {
                out.write("#" + tc + " " + msg);
                out.newLine();
                continue;
            }

            int flag = 0;

            for (int i = 0; i < front.length(); i++) {
                if (zero.contains(front.charAt(i)) && zero.contains(back.charAt(i))) flag++;
                if (one.contains(front.charAt(i)) && one.contains(back.charAt(i))) flag++;
                if (two.contains(front.charAt(i)) && two.contains(back.charAt(i))) flag++;
            }

            if (flag == front.length()) msg = "SAME";

            out.write("#" + tc + " " + msg);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}