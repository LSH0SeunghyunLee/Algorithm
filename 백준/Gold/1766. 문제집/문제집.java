import java.io.*;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 위상정렬에 사용할 진입차수 저장 배열
        int[] edgeCount =new int[N + 1];

        // 위상정렬에 사용할 그래프 2차원 리스트로 구현
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= N+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            graph.get(A).add(B);
            edgeCount[B]++;
        }

        topologicalSort(graph, edgeCount);

        bw.flush();
        bw.close();
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> graph,
                                int[] cntOfLink) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 1; i < N + 1; i++) {
            if (cntOfLink[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            for (int nextV : graph.get(v)) {
                cntOfLink[nextV]--;

                if (cntOfLink[nextV] == 0) {
                    queue.offer(nextV);
                }
            }
        }
    }
}