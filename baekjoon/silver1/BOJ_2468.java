package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2468 {

    static int N;
    static int[][] area;
    static boolean[][] visited;
    static int[] dx = new int[] {1, 0, -1, 0};
    static int[] dy = new int[] {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        area = new int[N][N];
        int maxHeight = 0;
        int maxSafeArea = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, area[i][j]);
            }
        }

        for (int i = 0; i <= maxHeight; i++) {
            visited = new boolean[N][N];
            int count = 0;

            for (int j = 0; j < N; j++) {
                for (int h = 0; h < N; h++) {
                    if (area[j][h] > i && !visited[j][h]) {
                        bfs(i, j, h);
                        count++;
                    }
                }
            }

            maxSafeArea = Math.max(maxSafeArea, count);
        }

        System.out.print(maxSafeArea);
    }

    public static void bfs(int height, int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {y, x});
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            int cy = queue.peek()[0];
            int cx = queue.peek()[1];
            queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextY = cy + dy[i];
                int nextX = cx + dx[i];

                if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < N) {
                    if (area[nextY][nextX] > height && !visited[nextY][nextX]) {
                        visited[nextY][nextX] = true;
                        queue.offer(new int[] {nextY, nextX});
                    }
                }
            }
        }
    }

}
