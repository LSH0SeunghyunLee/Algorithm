import java.io.*;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            String line = in.readLine();

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < line.length(); i++) {
                char character = line.charAt(i);
                if (character == 'b') stack.push('d');
                else if (character == 'd') stack.push('b');
                else if (character == 'p') stack.push('q');
                else stack.push('p');
            }

            int size = stack.size();

            out.write("#" + tc + " ");

            for (int i = 0; i < size; i++) {
                out.write(stack.pop());
            }

            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
