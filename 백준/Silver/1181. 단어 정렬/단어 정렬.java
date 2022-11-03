import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());

        String[] list = new String[N];

        for (int i = 0; i < N; i++) {
            list[i] = in.readLine();
        }

        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(list[0]).append('\n');

        for (int i = 1; i < N; i++) {
            if (!list[i].equals(list[i-1])) {
                sb.append(list[i]).append('\n');
            }
        }
        out.write(String.valueOf(sb));

        in.close();
        out.flush();
        out.close();
    }
}