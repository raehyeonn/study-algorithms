package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_2751 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }

        Collections.sort(list);

        for(int i : list) {
            sb.append(i).append("\n");
        }

        System.out.print(sb);

    }

}
