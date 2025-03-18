package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178 {

    static int N, M;
    static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int[][] maze;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            String str = br.readLine();

            for(int j = 0; j < M; j++) {
                maze[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        bfs();
        System.out.print(maze[N - 1][M - 1]);

    }

    static void bfs() {

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int nowY = current[0];
            int nowX = current[1];

            for(int[] direction : directions) {
                int moveY = nowY + direction[0];
                int moveX = nowX + direction[1];

                if(moveX >= 0 && moveY >= 0 && moveX < M && moveY < N && maze[moveY][moveX] == 1 && !visited[moveY][moveX]) {
                    visited[moveY][moveX] = true;
                    queue.offer(new int[] {moveY, moveX});
                    maze[moveY][moveX] = maze[nowY][nowX] + 1;
                }
            }
        }

    }

}
