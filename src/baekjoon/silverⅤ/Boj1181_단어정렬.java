package baekjoon.silverⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj1181_단어정렬 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (o1, o2) -> {
          // 단어 길이가 같을 경우
          if (o1.length() == o2.length()) return o1.compareTo(o2); // 사전순 정렬
          else {
             return o1.length() - o2.length();
          }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');

        for (int i = 1; i < N; i++) {
            // 중복되지 않는 단어만 출력
            if (!arr[i].equals(arr[i - 1])) sb.append(arr[i]).append('\n');
         }

        System.out.println(sb);

    }
}
