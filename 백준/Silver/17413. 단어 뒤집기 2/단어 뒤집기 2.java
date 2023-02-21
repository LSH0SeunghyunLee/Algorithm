import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String line = in.readLine();
        
        char[] arr = line.toCharArray();
        
        int flag = 0;
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '<') {
				flag = 1;
				int size = stack.size();
				for (int j = 0; j < size; j++) {
					out.write(stack.pop());
				}
			} else if (arr[i] == '>') {
				out.write(arr[i]);
				flag = 0;
				continue;
			}
			if (flag == 1) {
				out.write(arr[i]);
			} else {
				if (arr[i] == ' ' || i == arr.length-1) {
					if (i == arr.length - 1) {
						out.write(arr[i]);
					}
					int size = stack.size();
					for (int j = 0; j < size; j++) {
						out.write(stack.pop());
					}
					out.write(" ");
				} else {
					stack.push(arr[i]);
				}
			}
		}
    	
        in.close();
        out.flush();
        out.close();
    }
}
