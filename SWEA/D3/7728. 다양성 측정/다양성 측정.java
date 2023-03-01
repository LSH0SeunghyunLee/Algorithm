import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            Set<Integer> set = new HashSet<>();

            String line = in.readLine();

            for (int i = 0; i < line.length(); i++) {
                set.add(line.charAt(i)-48);
            }

            out.write("#" + tc + " " + set.size());
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
