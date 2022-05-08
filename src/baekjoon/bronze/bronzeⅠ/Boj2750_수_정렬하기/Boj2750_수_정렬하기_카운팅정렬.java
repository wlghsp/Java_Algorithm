package baekjoon.bronze.bronzeⅠ.Boj2750_수_정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Boj2750_수_정렬하기_카운팅정렬 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

		/*
		  range : -1000 ~ 1000
		  0 은 index[1000] 을 의미
		*/
        boolean[] arr = new boolean[2001];
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000] = true;
        }

        // 정렬과정이 따로 필요없음
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2001; i++) {
            if (arr[i]) {
                sb.append(i - 1000).append('\n');
            }
        }

        System.out.println(sb);

    }
}
