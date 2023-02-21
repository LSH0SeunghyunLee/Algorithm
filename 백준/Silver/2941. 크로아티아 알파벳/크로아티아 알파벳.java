import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = in.readLine();
        
        line = line.replace("c=", " ");
        line = line.replace("c-", " ");
        line = line.replace("dz=", " ");
        line = line.replace("d-", " ");
        line = line.replace("lj", " ");
        line = line.replace("nj", " ");
        line = line.replace("s=", " ");
        line = line.replace("z=", " ");

        out.write(String.valueOf(line.length()));
        out.newLine();

        in.close();
        out.flush();
        out.close();
    }
}
