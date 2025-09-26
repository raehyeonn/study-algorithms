package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2753 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());
        boolean flag = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                flag = true;
            }
        }

        System.out.print(flag ? "1" : "0");
    }

}
