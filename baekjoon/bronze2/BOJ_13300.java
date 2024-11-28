package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] students = new int[12];
        int roomCount = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if(S == 0) {
                students[Y - 1]++;
            } else {
                students[Y + 5]++;
            }
        }

        for(int j = 0; j < 12; j++) {
            if(students[j] != 0) {
                roomCount += students[j] / K + 1;

                if(students[j] % K == 0) {
                    roomCount -= 1;
                }
            }
        }

        System.out.print(roomCount);
    }
}
