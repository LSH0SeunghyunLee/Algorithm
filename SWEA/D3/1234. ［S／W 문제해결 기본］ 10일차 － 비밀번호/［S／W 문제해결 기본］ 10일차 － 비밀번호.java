import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

//        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= 10; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int N = Integer.parseInt(st.nextToken());
            String M = st.nextToken();

            List<Character> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                list.add(M.charAt(i));
            }

            int cnt = 0;

            while (cnt < list.size() - 1) {
                if (list.get(cnt) == list.get(cnt+1)) {
                    while (list.get(cnt).equals(list.get(cnt+1))) {
                        list.remove(cnt);
                        list.remove(cnt);
                        cnt--;
                        if (cnt == -1) break;
                        if (cnt >= list.size()-1) break;
                    }
                }
                cnt++;
            }

            out.write("#" + tc + " ");
            for (int i = 0; i < list.size(); i++) {
                out.write(list.get(i));
            }
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
