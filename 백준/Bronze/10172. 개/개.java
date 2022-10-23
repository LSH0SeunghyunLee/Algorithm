
    
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        out.write("|\\_/|");
        out.newLine();
        out.write("|q p|   /}");
        out.newLine();
        out.write("( 0 )\"\"\"\\");
        out.newLine();
        out.write("|\"^\"`    |");
        out.newLine();
        out.write("||_/=\\\\__|");

        out.flush();
        out.close();
    }
}