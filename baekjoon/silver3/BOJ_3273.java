package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int x = Integer.parseInt(br.readLine());
        int count = 0;

        for(int j = 0; j < arr.length; j++) {
            if(arr[j] <= x) {
                int num = x - arr[j];

                for(int k = j + 1; k < arr.length; k++) {
                    if(arr[k] == num) {
                        count++;
                        break;
                    }
                }
            } else {
                break;
            }
        }

        System.out.print(count);

        br.close();
    }
}
