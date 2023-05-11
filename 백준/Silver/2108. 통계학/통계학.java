import java.io.*;
import java.util.Arrays;

public class Main {
    static int N, max, min;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }

        int sg = sansoolgiha();
        int mid = middle();
        int mo = most();

        bw.write(sg + "\n");
        bw.write(mid + "\n");
        bw.write(mo + "\n");
        bw.write(max - min + "");
        bw.flush();
        bw.close();
    }

    static int sansoolgiha() {
        double sum = 0;

        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }

        return (int) Math.round(sum / N);
    }

    static int middle() {
        int[] temp = arr;

        Arrays.sort(temp);

        return temp[N/2];
    }

    static int most() {
        for (int i = 0; i < N; i++) {
            arr[i] += 4000;
        }

        int[] temp = new int[8001];

        for (int i = 0; i < N; i++) {
            temp[arr[i]]++;
        }

        int max = 0;
        int cnt = 0;

        for (int i = 0; i <= 8000; i++) {
            if (max < temp[i]) max = temp[i];
        }

        for (int i = 0; i <= 8000; i++) {
            if (temp[i] == max) cnt++;
        }

        int flag = 0;

        if (cnt > 1) {
            for (int i = 0; i <= 8000; i++) {
                if (temp[i] == max && flag == 0) flag = 1;
                else if (temp[i] == max && flag == 1) {
                    return i-4000;
                }
            }
        } else {
            for (int i = 0; i <= 8000; i++) {
                if (temp[i] == max) return i-4000;
            }
        }
        return 0;
    }
}
