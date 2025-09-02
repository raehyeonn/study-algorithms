package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_24445 {

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        result = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list.get(i), Collections.reverseOrder());
        }

        bfs(R);

        for (int i = 1; i <= N; i++) {
            sb.append(result[i]).append("\n");
        }

        System.out.print(sb);
    }

    static public void bfs(int R) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(R);
        visited[R] = true;

        int order = 1;
        result[R] = order++;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int i = 0; i < list.get(cur).size(); i++) {
                int next = list.get(cur).get(i);

                if (!visited[next]) {
                    visited[next] = true;
                    result[next] = order++;
                    queue.add(next);
                }
            }
        }
    }

}
