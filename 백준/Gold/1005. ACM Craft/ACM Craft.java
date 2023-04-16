import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, W;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[N + 1];

            st = new StringTokenizer(br.readLine());

            for (int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

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

            W = Integer.parseInt(br.readLine());

            topologicalSort(graph, edgeCount, W);
        }

        bw.flush();
        bw.close();
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> graph,
                                int[] cntOfLink, int W) {
        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[N + 1];

        // 초기: 선행 정점을 가지지 않는 정점을 큐에 삽입
        for (int i = 1; i < N + 1; i++) {
            result[i] = arr[i];
            if (cntOfLink[i] == 0) { // 해당 정점의 간선의 수가 0이면
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int v = queue.poll();

            for (int nextV : graph.get(v)) {
                result[nextV] = Math.max(result[nextV], result[v] + arr[nextV]);
                cntOfLink[nextV]--;

                if (cntOfLink[nextV] == 0) {
                    queue.offer(nextV);
                }
            }
        }

        System.out.println(result[W]);
    }
}