package gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7576 {

    static int M, N;
    static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int[][] box;
    static boolean[][] visited;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        box = new int[N][M];
        visited = new boolean[N][M];

        boolean hasUnripeTomato = false;
        int totalDays = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());

                if(box[i][j] == 1) {
                    queue.offer(new int[] {i, j});
                }
            }
        }

        bfs();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(box[i][j] == 0) {
                    hasUnripeTomato = true;
                } else {
                    if(box[i][j] > totalDays) {
                        totalDays = box[i][j];
                    }
                }
            }
        }

        if(hasUnripeTomato) {
            System.out.print("-1");
        } else {
            System.out.print(totalDays - 1);
        }

    }

    static void bfs() {

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int nowY = current[0];
            int nowX = current[1];

            for(int[] direction : directions) {
                int moveY = nowY + direction[0];
                int moveX = nowX + direction[1];

                if(moveX >= 0 && moveY >= 0 && moveX < M && moveY < N && box[moveY][moveX] == 0 && !visited[moveY][moveX]) {
                    visited[moveY][moveX] = true;
                    queue.offer(new int[] {moveY, moveX});
                    box[moveY][moveX] = box[nowY][nowX] + 1;
                }
            }
        }

    }

}
