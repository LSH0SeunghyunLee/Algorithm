import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int[] arr;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());

        StringTokenizer nTokenizer = new StringTokenizer(in.readLine());

        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(nTokenizer.nextToken());
        }

        Arrays.sort(arr);

        int K = Integer.parseInt(in.readLine());

        StringTokenizer kTokenizer = new StringTokenizer(in.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < K; i++) {
            if(binarySearch(Integer.parseInt(kTokenizer.nextToken())) >= 0) {
                stringBuilder.append(1).append('\n');
            }
            else {
                stringBuilder.append(0).append('\n');
            }
        }

        out.write(String.valueOf(stringBuilder));

        in.close();
        out.flush();
        out.close();
    }

    public static int binarySearch(int key) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if(key < arr[mid]) {
                hi = mid - 1;
            } else if(key > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}