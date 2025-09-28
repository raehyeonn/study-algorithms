package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        if (B + C <= 59) {
            System.out.print(A + " " + (B + C));
        } else {
            int H = A + ((B + C) / 60);
            int M = (B + C) % 60;

            if (H >= 24) {
                H = H -24;
            }

            System.out.print(H + " " + M);
        }
    }

}
