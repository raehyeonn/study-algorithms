package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1212 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String octal = br.readLine();

        for (int i = 0; i < octal.length(); i++) {
            int num = octal.charAt(i) - '0';

            sb.append(binary[num]);
        }

        if (octal.equals("0")) {
            System.out.print(octal);
        } else {
            while (sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }

            System.out.print(sb);
        }
    }

}
