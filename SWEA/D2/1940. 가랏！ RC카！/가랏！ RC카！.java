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
            int N = Integer.parseInt(in.readLine());

            int location = 0;
            int speed = 0;

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());

                int order = Integer.parseInt(st.nextToken());

                int plus = 0;

                if (order == 1 || order == 2) {
                    plus = Integer.parseInt(st.nextToken());
                }

                if (order == 1) speed += plus;
                else if (order == 2) {
                    if (speed < plus) speed = 0;
                    else speed -= plus;
                }
                location += speed;
            }

            out.write("#" + tc + " " + location);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
