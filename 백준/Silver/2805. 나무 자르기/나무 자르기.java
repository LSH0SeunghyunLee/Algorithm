import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        int[] arr = new int[N];

        int max = 0;

        tokenizer = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
            if (arr[i] > max) max = arr[i];
        }

        int start = 0;
        int end = max;

        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            long sum = 0L;

            for (int a : arr) {
                if (a > mid) sum += a - mid;
            }

            if (M <= sum) {
                start = mid + 1;
                if (mid >= result) result = mid;
            } else end = mid - 1;
        }

        out.write(String.valueOf(result));
        out.newLine();

        in.close();
        out.flush();
        out.close();
    }
}