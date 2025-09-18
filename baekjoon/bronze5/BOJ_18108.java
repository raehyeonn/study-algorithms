package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_18108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int buddhistYear = Integer.parseInt(br.readLine());

        System.out.print(buddhistYear - 543);
    }

}
