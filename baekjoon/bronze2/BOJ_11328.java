package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            boolean possible = true;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word1 = st.nextToken();
            String word2 = st.nextToken();

            if(word1.length() != word2.length()) {
                sb.append("Impossible" + "\n");
                continue;
            }

            int[] alphabet1 = new int[26];
            int[] alphabet2 = new int[26];

            for(int j = 0; j < word1.length(); j++) {
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);
                alphabet1[c1 - 97]++;
                alphabet2[c2 - 97]++;
            }

            for(int k = 0; k < alphabet1.length; k++) {
                if(alphabet1[k] != alphabet2[k]) {
                    possible = false;
                    break;
                }
            }

            if(possible) {
                sb.append("Possible" + "\n");
            } else {
                sb.append("Impossible" + "\n");
            }
        }

        System.out.println(sb);
    }
}
