package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] alphabet = new int[26];

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            alphabet[c - 'a']++;
        }

        for(int j = 0; j < alphabet.length; j++) {
            System.out.print(alphabet[j] + " ");
        }

        br.close();
    }
}
