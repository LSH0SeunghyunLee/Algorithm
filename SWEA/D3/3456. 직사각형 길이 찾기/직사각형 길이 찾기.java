import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            Loop:
            for (int i = 0; i < 2; i++) {
                for (int j = i + 1; j < 3; j++) {
                    int a = list.get(i);
                    if (list.get(i).equals(list.get(j))) {
                        list.remove(list.indexOf(a));
                        list.remove(list.indexOf(a));
                        break Loop;
                    }
                }
            }

            out.write("#" + tc + " " + list.get(0));
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
