import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            String line = in.readLine();

            List<Character> list = new ArrayList<>();

            for (int i = 0; i < line.length(); i++) {
                char a = line.charAt(i);
                if (!list.contains(a)) list.add(line.charAt(i));
                else list.remove(list.indexOf(a));
            }

            out.write("#" + tc + " " + list.size());
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}