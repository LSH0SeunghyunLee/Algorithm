import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        out.write("\\    /\\");
        out.newLine();
        out.write(" )  ( ')");
        out.newLine();
        out.write("(  /  )");
        out.newLine();
        out.write(" \\(__)|");

        out.flush();
        out.close();
    }
}