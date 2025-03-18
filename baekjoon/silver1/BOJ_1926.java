package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1926 {

    static int n, m;
    static int[][] directions= {{1,0},{-1,0}, {0,1}, {0,-1}};
    static int[][] paper;
    static boolean[][] visited;
    static int area;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> answer = new ArrayList<>();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        paper = new int[n][m];
        visited = new boolean[n][m];
        boolean hasPicture = false;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < m; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());

                if(paper[i][j] == 1) {
                    hasPicture = true;
                }
            }
        }

        if(!hasPicture) {
            System.out.println("0");
            System.out.println("0");
            return;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                area = 0;

                if(paper[i][j] == 1 && !visited[i][j]) {
                    area++;
                    bfs(i, j);
                    answer.add(area);
                }
            }
        }

        Collections.sort(answer);
        int count = answer.size();
        System.out.println(count);
        System.out.println(answer.get(count - 1));

    }

    static void bfs(int y, int x) {

        visited[y][x] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {y, x});

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int nowY = current[0];
            int nowX = current[1];

            for(int[] direction : directions) {
                int moveY = nowY + direction[0];
                int moveX = nowX + direction[1];

                if(moveX >= 0 && moveY >= 0 && moveX < m && moveY < n && paper[moveY][moveX] == 1 && !visited[moveY][moveX]) {
                    visited[moveY][moveX] = true;
                    area++;
                    queue.offer(new int[] {moveY, moveX});
                }
            }
        }

    }

}
