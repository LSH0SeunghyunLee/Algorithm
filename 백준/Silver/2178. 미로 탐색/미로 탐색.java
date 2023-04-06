import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Node {
        int x, y, dist;
        public Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    static int N, M, min, cnt;
    static int[][] arr;
    static boolean[][] visited;
    static Queue<Node> q;
    static int[] rd = {-1, 1, 0, 0};
    static int[] cd = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j)-48;
            }
        }

        min = Integer.MAX_VALUE;

        q = new LinkedList<>();
        visited = new boolean[N][M];

        bfs(new Node(0, 0, 0));

        bw.write(min + "");
        bw.flush();
        bw.close();
    }

    static void bfs(Node node) {
        q.offer(node);

        while(!q.isEmpty()) {
            Node cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextR = cur.x + rd[i];
                int nextC = cur.y + cd[i];
                int nextDist = cur.dist + 1;

                if (nextR < 0 || nextR >= N || nextC < 0 || nextC >= M || visited[nextR][nextC] || arr[nextR][nextC] == 0) {
                    continue;
                }

//                if (arr[nextR][nextC] == 1 && cnt == 1)  {
//                    arr[nextR][nextC] = 0;
//                    cnt = 0;
//                } else if (arr[nextR][nextC] == 1 && cnt == 0) continue;

                if (nextR == N-1 && nextC == M-1) {
                    min = Math.min(min, ++nextDist);
                    return;
                }

                q.add(new Node(nextR, nextC, nextDist));
                visited[nextR][nextC] = true;
            }
        }
    }
}