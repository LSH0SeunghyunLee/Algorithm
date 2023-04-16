import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Node {
        private int A;
        private int B;

        public Node(int A, int B) {
            this.A = A;
            this.B = B;
        }
    }

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
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= N+1; i++) {
            graph.add(new ArrayList<>());
        }

        // 2차원 리스트의 인덱스가 학생번호
        // 주어진 키 비교정보에 따라 2차원 리스트 정보 초기화
        // 리스트 초기화 하면서 진입차수배열 값 초기화
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph.get(A).add(B);
            edgeCount[B]++;
        }

        topologicalSort(graph, edgeCount);
        
//        bw.write(min + "");
        bw.flush();
        bw.close();
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> graph, int[] cntOfLink) {
        Queue<Integer> queue = new LinkedList<>();

        // 초기: 선행 정점을 가지지 않는 정점을 큐에 삽입
        for (int i = 1; i < N + 1; i++) {
            if (cntOfLink[i] == 0) { // 해당 정점의 간선의 수가 0이면
                queue.add(i);
            }
        }

        // 정점의 수 만큼 반복
        for (int i = 0; i < N; i++) {
            int v = queue.remove(); // 1. 큐에서 정점 추출
            System.out.print(v + " "); // 정점 출력

            // 2. 해당 정점과 연결된 모든 정점에 대해
            for (int nextV : graph.get(v)) {
                cntOfLink[nextV]--; // 2-1. 간선의 수 감소

                // 2-2. 선행 정점을 가지지 않는 정점을 큐에 삽입
                if (cntOfLink[nextV] == 0) { // 해당 정점의 간선의 수가 0이면
                    queue.add(nextV);
                }
            }
        }
    }
}