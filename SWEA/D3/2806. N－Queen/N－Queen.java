import java.io.*;

public class Solution {
    static int N, cnt;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= testcase; tc++) {
            N = Integer.parseInt(br.readLine());

            arr = new int[N];

            cnt = 0;

            backtracking(0);

            bw.write("#" + tc + " " + cnt);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void backtracking(int depth) {
        if(depth == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (check(depth)) {
                backtracking(depth+1);
            }
        }
    }

    public static boolean check(int depth) {
        for (int i = 0; i < depth; i++) {
            if (arr[depth] == arr[i]) {
                return false;
            } else if (Math.abs(depth - i) == Math.abs(arr[depth] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}
