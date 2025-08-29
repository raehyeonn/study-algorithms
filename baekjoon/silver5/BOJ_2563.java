package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2563 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean[][] paper = new boolean[100][100];
        int n = Integer.parseInt(br.readLine());
        int area = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int left = Integer.parseInt(st.nextToken());
            int down = Integer.parseInt(st.nextToken());

            for (int j = left - 1; j < left + 9; j++) {
                for (int k = down - 1; k < down + 9; k++) {
                    if (!paper[j][k]) {
                        paper[j][k] = true;
                        area++;
                    }
                }
            }
        }

        System.out.print(area);
    }

}
