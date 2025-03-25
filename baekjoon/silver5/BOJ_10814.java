package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder[] people = new StringBuilder[201];

        for(int i = 0; i < people.length; i++) {
            people[i] = new StringBuilder();
        }

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            people[age].append(age).append(" ").append(name).append("\n");
        }

        StringBuilder sb = new StringBuilder();

        for(StringBuilder person : people) {
            sb.append(person);
        }

        System.out.print(sb);

    }

}
