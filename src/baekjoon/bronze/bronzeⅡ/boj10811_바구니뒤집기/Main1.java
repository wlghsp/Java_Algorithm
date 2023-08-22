package baekjoon.bronze.bronzeⅡ.boj10811_바구니뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] baskets = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            baskets[i] = i;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            while (a < b) {
                int tmp = baskets[a];
                baskets[a++] = baskets[b];
                baskets[b--] = tmp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(baskets[i]).append(" ");
        }
        System.out.println(sb);
    }
}
