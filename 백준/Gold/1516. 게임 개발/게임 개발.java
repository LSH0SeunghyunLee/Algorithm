import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        arr = new int[N + 1];

        // 위상정렬에 사용할 진입차수 저장 배열
        int[] edgeCount =new int[N + 1];

        // 위상정렬에 사용할 그래프 2차원 리스트로 구현
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= N+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i] = Integer.parseInt(st.nextToken());

            while (true) {
                int pre = Integer.parseInt(st.nextToken());

                if (pre == -1) break;

                graph.get(pre).add(i);
                edgeCount[i]++;
            }
        }

        topologicalSort(graph, edgeCount);

        bw.flush();
        bw.close();
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> graph,
                                int[] cntOfLink) {
        Queue<Integer> queue = new LinkedList<>();

        int[] result = new int[N+1];

        for (int i = 1; i < N + 1; i++) {
            if (cntOfLink[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int v = queue.poll();

            for (int nextV : graph.get(v)) {
                cntOfLink[nextV]--;

                result[nextV] = Math.max(result[nextV], result[v] + arr[v]);

                if (cntOfLink[nextV] == 0) {
                    queue.offer(nextV);
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(result[i] + arr[i]);
        }
    }
}