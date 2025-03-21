package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];

        for(int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        for(int i = 2; i <= N; i++) {
            if(arr[i] == 0) {
                continue;
            }

            for(int j = i + i; j <= N; j += i) {
                arr[j] = 0;
            }
        }

        for(int i = M; i <= N; i++) {
            if(arr[i] != 0) {
                sb.append(i + "\n");
            }
        }

        System.out.print(sb);

    }

}
