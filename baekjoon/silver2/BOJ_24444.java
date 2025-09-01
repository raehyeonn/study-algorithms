package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_24444 {

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // 문제에 간선만 주어졌기 때문에 인접리스트를 만듦
    static boolean[] visited; // 정점 i를 방문했는지 기록
    static int[] result; // 정점 i가 몇 번째로 방문됐는지 기록

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); // 정점 수
        int M = Integer.parseInt(st.nextToken()); // 간선 수
        int R = Integer.parseInt(st.nextToken()); // 시작 정점
        visited = new boolean[N + 1];
        result = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        // 간선 정보 저장
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a); // 양방향
        }

        // 각 정점의 인접 리스트 오름차순 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(list.get(i));
        }

        bfs(R);

        for (int i = 1; i <= N; i++) {
            sb.append(result[i]).append("\n");
        }

        System.out.print(sb);
    }

    public static void bfs(int R) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(R);
        visited[R] = true;

        int order = 1; // 방문 순서
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
