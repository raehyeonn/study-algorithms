package silver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Character> list = new LinkedList<>();
        String str = br.readLine();

        for (char c : str.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> iterator = list.listIterator(list.size());
        int M = Integer.parseInt(br.readLine());

        for(int i = 0; i < M; i++) {
            String command = br.readLine();

            switch(command.charAt(0)) {
                case 'L':
                    if(iterator.hasPrevious()){
                        iterator.previous();
                    }
                    break;

                case 'D':
                    if(iterator.hasNext()){
                        iterator.next();
                    }
                    break;

                case 'B':
                    if(iterator.hasPrevious()){
                        iterator.previous();
                        iterator.remove();
                    }
                    break;

                case 'P':
                    char message = command.charAt(2);
                    iterator.add(message);
                    break;
            }
        }

        for(char c : list) {
            bw.write(c);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
