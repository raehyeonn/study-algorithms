package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int num2 = Integer.parseInt(str);

        for (int i = 2; i >= 0; i--) {
            int num = Integer.parseInt(str.substring(i, i + 1));

            System.out.println(num1 * num);
        }

        System.out.print(num1 * num2);
    }

}
