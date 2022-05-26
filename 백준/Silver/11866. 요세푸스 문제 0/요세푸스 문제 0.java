import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> numList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 0; i < a; i++) {
            queue.add(i+1);
        }

        while (queue.size() != 0) {
            for (int i = 0; i < b-1; i++) {
                queue.offer(queue.poll());
            }
            numList.add(queue.poll());
        }
        System.out.print("<");
        for (int i = 0; i < numList.size() - 1; i++) {
            System.out.print(numList.get(i) + ", ");
        }
        System.out.print(numList.get(numList.size()-1));
        System.out.print(">");
    }
}