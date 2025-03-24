package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_15688 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int num1 = Integer.parseInt(br.readLine());
            list.add(num1);
        }

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            int num2 = list.get(i);
            sb.append(num2).append("\n");
        }

        System.out.print(sb);

    }

}
