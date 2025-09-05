package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int num = Integer.parseInt(str.substring(i, i + 1));
            list.add(num);
        }

        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }

        System.out.print(sb);
    }

}
