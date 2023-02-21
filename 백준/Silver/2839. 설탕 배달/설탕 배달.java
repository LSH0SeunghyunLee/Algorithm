import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int sugar = Integer.parseInt(in.readLine());
        
        int five = sugar / 5;
        int three = 0;
        
        int idx = 0;
        int flag = 0;
        
        while (five >= idx) {
        	if ((sugar - ((five - idx)*5))%3 != 0) {
        		idx++;
        	} else {
        		flag = 1;
        		three = (sugar - ((five - idx)*5)) / 3;
        		five -= idx;
        		break;
        	}
        }
        
        if (flag == 1) {
        	out.write(String.valueOf(three+five));
        } else {
        	out.write(String.valueOf(-1));
        }
        

        in.close();
        out.flush();
        out.close();
    }
}
