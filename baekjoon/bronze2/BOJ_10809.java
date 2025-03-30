package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();
        int[] alphabet = new int[26];

        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(alphabet[c - 'a'] == -1) {
                alphabet[c - 'a'] = i;
            }
        }

        for(int i = 0; i < alphabet.length; i++) {
            sb.append(alphabet[i]).append(" ");
        }

        System.out.print(sb);

    }

}
