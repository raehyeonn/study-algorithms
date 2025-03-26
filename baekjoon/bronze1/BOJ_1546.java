package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1546 {

    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int N = Integer.parseInt(br.readLine());
         double[] scores = new double[N];

         StringTokenizer st = new StringTokenizer(br.readLine());

         for(int i = 0; i < N; i++) {
             int score = Integer.parseInt(st.nextToken());
             scores[i] = score;
         }

         Arrays.sort(scores);
         double sum = 0;

         for(double score : scores) {
             double newScore = (score / scores[N - 1]) * 100;
             sum = sum + newScore;
         }

         double avg = sum / N;
         System.out.print(avg);

    }

}
