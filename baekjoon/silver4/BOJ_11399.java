package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11399 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] P = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(P);

        int sum = 0;
        int[] minute = new int[N];
        minute[0] = P[0];

        for(int i = 1; i < N; i++) {
            minute[i] = minute[i - 1] + P[i];
        }

        for(int i : minute) {
            sum += i;
        }

        System.out.print(sum);

    }

}
