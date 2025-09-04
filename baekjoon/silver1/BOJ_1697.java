package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.print("0");
            return;
        }

        int[] visited = new int[100001];
        visited[N]++;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == K) {
                System.out.print(visited[current] - 1);
                return;
            }

            int[] next = {current - 1, current + 1, current * 2};

            for (int i = 0; i < 3; i++) {
                if (next[i] >= 0 && next[i] < 100001 && visited[next[i]] == 0) {
                    visited[next[i]] = visited[current] + 1;
                    queue.add(next[i]);
                }
            }
        }
    }

}
