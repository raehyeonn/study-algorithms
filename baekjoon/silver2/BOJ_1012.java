package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1012 {

    static int M, N, K;
    static boolean[][] cabbage;
    static boolean[][] visited;
    static int count;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken()); // 가로
            N = Integer.parseInt(st.nextToken()); // 세로
            K = Integer.parseInt(st.nextToken()); // 배추 개수
            cabbage = new boolean[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());

                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                cabbage[Y][X] = true;
            }

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (cabbage[j][k] && !visited[j][k]) {
                        bfs(j, k);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {y, x});

        while (!queue.isEmpty()) {
            int a = queue.peek()[0]; // y
            int b = queue.peek()[1]; // x

            queue.poll();
            visited[a][b] = true;

            for (int i = 0; i < 4; i++) {
                int cy = a + dy[i];
                int cx = b + dx[i];

                if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
                    if (cabbage[cy][cx] && !visited[cy][cx]) {
                        queue.add(new int[] {cy, cx});
                        visited[cy][cx] = true;
                    }
                }
            }
        }
    }

}