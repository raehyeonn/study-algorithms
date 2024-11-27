package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word1 = br.readLine();
        String word2 = br.readLine();
        char[] alphabet1 = new char[word1.length()];
        char[] alphabet2 = new char[word2.length()];

        for(int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            alphabet1[i] = c;
        }

        for(int j = 0; j < word2.length(); j++) {
            char c = word2.charAt(j);
            alphabet2[j] = c;
        }

        int count1 = word1.length();
        int count2 = word2.length();

        for(int k = 0; k < alphabet1.length; k++) {
            for(int l = 0; l < alphabet2.length; l++) {
                if(alphabet1[k] == alphabet2[l]) {
                    alphabet2[l] = 0;
                    count1--;
                    count2--;
                    break;
                }
            }
        }

        System.out.println(count1 + count2);
    }
}
