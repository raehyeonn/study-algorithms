package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2480 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int money;

        if (A == B && B == C) {
            money = 10000 + (A * 1000);
            System.out.print(money);
        } else if (A == B || A == C) {
            money = 1000 + (A * 100);
            System.out.print(money);
        } else if (B == C) {
            money = 1000 + (B * 100);
            System.out.print(money);
        } else {
            int max = Math.max(A, B);
            max = Math.max(max, C);
            System.out.print(max * 100);
        }
    }

}
