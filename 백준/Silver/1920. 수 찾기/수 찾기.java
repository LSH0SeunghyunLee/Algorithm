import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int result = binarySearch(Integer.parseInt(st.nextToken()));

            if (result >= 0) sb.append(1 + "\n");
            else sb.append(0 + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int binarySearch(int key) {
        int lo = 0;
        int hi = N - 1;

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
