import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] pwArr = {"0001101", "0011001", "0010011", "0111101", "0100011",
                "0110001", "0101111", "0111011", "0110111", "0001011"};

        int testcase = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] arr = new int[8];

            int flag = 0;

            for (int i = 0; i < N; i++) {
                String line = in.readLine();

                if (line.length() != M) break;

                if (line.split("1")[0].length() == M || flag == 1) {
                    continue;
                }

                for (int j = M - 1; j >= 0; j--) {
                    if (line.charAt(j) == '1') {
                        int idx = 0;
                        for (int k = j - 55; k <= j; k += 7) {
                            StringBuilder sb = new StringBuilder();
                            for (int l = 0; l < 7; l++) {
                                char a = line.charAt(k + l);
                                sb.append(a);
                            }

                            String password = sb.toString();

                            for (int l = 0; l < 10; l++) {
                                if (password.equals(pwArr[l])) {
                                    arr[idx++] = l;
                                    break;
                                }
                            }
                        }

                        break;
                    }
                }

                flag = 1;
            }

            int sum = 0;

            for (int i = 0; i < 8; i += 2) {
                sum += arr[i];
            }

            sum *= 3;

            for (int i = 1; i < 8; i += 2) {
                sum += arr[i];
            }

            if (sum % 10 == 0 && sum / 10 >= 1) {
                int result = 0;
                for (int i = 0; i < 8; i++) {
                    result += arr[i];
                }
                out.write("#" + tc + " " + result);
            } else {
                out.write("#" + tc + " 0");
            }

            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
