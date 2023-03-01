import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            int N = Integer.parseInt(in.readLine());

            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < N; i++) {
                int a = Integer.parseInt(in.readLine());
                if (a != 0) stack.push(a);
                else stack.pop();
            }

            int sum = 0;
            int size = stack.size();

            for (int i = 0; i < size; i++) {
                sum += stack.pop();
            }

            out.write("#" + tc + " " + sum);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}