import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int day, month, three, year, min;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            day = Integer.parseInt(st.nextToken());
            month = Integer.parseInt(st.nextToken());
            three = Integer.parseInt(st.nextToken());
            year = Integer.parseInt(st.nextToken());

            arr = new int[12];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 12; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            min = year;

            price(0, 0);

            bw.write("#" + tc + " " + min);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    private static void price(int idx,int price) {
        if (price > min) return;

        if (idx >= 12) {
            min = Math.min(price, min);
        } else if(arr[idx] == 0) {
            price(idx + 1, price);
        } else {
            price(idx + 1, price+(day*arr[idx]));
            price(idx + 1, price+month);
            price(idx + 3, price+three);
        }
    }
}