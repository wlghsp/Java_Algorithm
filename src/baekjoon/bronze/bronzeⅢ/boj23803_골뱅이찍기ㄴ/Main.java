package baekjoon.bronze.bronzeⅢ.boj23803_골뱅이찍기ㄴ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append("@");
            }
            sb.append("\n");
            for (int j = 0; j < N; j++) {
                sb.append("@");
            }
            sb.append("\n");
            for (int j = 0; j < N; j++) {
                sb.append("@");
            }
            sb.append("\n");
            for (int j = 0; j < N; j++) {
                sb.append("@");
            }
            sb.append("\n");

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append("@@@@@");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
