import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(in.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(in.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int t = Integer.parseInt(in.readLine());

        if (((x + t) / w) % 2 == 1) {
            x = w - (x + t) % w;
        } else {
            x = (x + t) % w;
        }

        if (((y + t) / h) % 2 == 1) {
            y = h - (y + t) % h;
        } else {
            y = (y + t) % h;
        }

        out.write(x + " " + y);

        out.flush();
        out.close();
    }
}
