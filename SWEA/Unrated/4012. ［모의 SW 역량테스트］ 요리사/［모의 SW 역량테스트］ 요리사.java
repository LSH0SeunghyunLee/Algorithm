import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    static int[][] arr;
    static int N, min;
    static boolean[] sel;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            N = Integer.parseInt(in.readLine());

            arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sel = new boolean[N];

            min = Integer.MAX_VALUE;

            combination(0, 0);

            out.write("#" + tc + " " + min);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }

    public static void combination(int idx, int sidx) {
        if (idx == N) {
            List<Integer> listA = new ArrayList<>();
            List<Integer> listB = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (sel[i]) listA.add(i);
                else listB.add(i);
            }
            min = Math.min(min, Math.abs(calc(listA) - calc(listB)));
            return;
        }

        sel[sidx] = true;
        combination(idx+1, sidx+1);
        sel[sidx] = false;
        combination(idx+1, sidx+1);
    }

    public static int calc(List<Integer> list) {
        int sum=0;
        int size=list.size();

        for (int i = 0; i < size-1; i++) {
            for(int j=i+1; j<size; j++) {
                sum+=arr[list.get(i)][list.get(j)];
                sum+=arr[list.get(j)][list.get(i)];
            }
        }
        return sum;
    }
}
