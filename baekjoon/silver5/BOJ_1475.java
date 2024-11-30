package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] arr = new int[9];
        int count = 0;

        for(int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int num = Character.getNumericValue(c);

            if(num == 6 || num == 9) {
                count++;
                if(count % 2 == 1) {
                    arr[6]++;
                }
            } else {
                arr[num]++;
            }
        }

        Arrays.sort(arr);
        System.out.println(arr[8]);

        br.close();
    }
}
