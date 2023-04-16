import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;

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

            int count = Integer.parseInt(st.nextToken());

            int init = Integer.parseInt(st.nextToken());;

            for (int j = 1; j < count; j++) {
                int a = Integer.parseInt(st.nextToken());

                graph.get(init).add(a);
                edgeCount[a]++;

                init = a;
            }
        }

        topologicalSort(graph, edgeCount);

        bw.flush();
        bw.close();
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> graph,
                                int[] cntOfLink) {
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int[] newArr = new int[N+1];

        for (int i = 1; i < N + 1; i++) {
            if (cntOfLink[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int v = queue.poll();
            newArr[v]++;
            sb.append(v + "\n");

            for (int nextV : graph.get(v)) {
                cntOfLink[nextV]--;

                if (cntOfLink[nextV] == 0) {
                    queue.offer(nextV);
                }
            }
        }

        int flag = 0;

        for (int i = 1; i < N+1; i++) {
            if (newArr[i] == 0) flag = 1;
        }

        if (flag == 1) {
            System.out.println(0);
        } else {
            System.out.println(sb);
        }
    }
}