import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int K, max;
    static int[][] arr;
    static int[] temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            K = Integer.parseInt(br.readLine());

            arr = new int[4][8];

            for (int i = 0; i < 4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 8; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            temp = new int[3];

            for (int i = 0; i < K; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int magnet = Integer.parseInt(st.nextToken());
                int direction = Integer.parseInt(st.nextToken());

                magnet -= 1;

                for (int j = 0; j < 3; j++) {
                    if (arr[j][2] != arr[j+1][6]) temp[j] = 1;
                    else temp[j] = 0;
                }

                if (magnet == 0) {
                    move(arr[0], direction);
                    for (int j = 0; j < 3; j++) {
                        direction *= -1;
                        if (temp[j] == 1) move(arr[j+1], direction);
                        else break;
                    }
                } else if (magnet == 1) {
                    move(arr[1], direction);
                    if (temp[0] == 1) move(arr[0], direction*(-1));
                    for (int j = 1; j < 3; j++) {
                        direction *= -1;
                        if (temp[j] == 1) move(arr[j+1], direction);
                        else break;
                    }
                } else if (magnet == 2) {
                    move(arr[2], direction);
                    if (temp[2] == 1) move(arr[3], direction*(-1));
                    for (int j = 1; j >= 0; j--) {
                        direction *= -1;
                        if (temp[j] == 1) move(arr[j], direction);
                        else break;
                    }
                } else {
                    move(arr[3], direction);
                    for (int j = 2; j >= 0; j--) {
                        direction *= -1;
                        if (temp[j] == 1) move(arr[j], direction);
                        else break;
                    }
                }
            }

            max = 0;

            for (int i = 0; i < 4; i++) {
                if (arr[i][0] == 1) {
                    max += arr[i][0] * Math.pow(2, i);
                }
            }

            bw.write("#" + tc + " " + max);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    static void move(int[] arr, int a) {
        if (a == 1) {
            int temp = arr[7];
            for (int i = 6; i >= 0; i--) {
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
        } else {
            int temp = arr[0];
            for (int i = 0; i < 7; i++) {
                arr[i] = arr[i+1];
            }
            arr[7] = temp;
        }
    }
}