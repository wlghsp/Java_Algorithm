package baekjoon.bronze.bronzeⅣ.boj4470_줄번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N+1; i++) {
            String s = br.readLine();
            sb.append(i).append(". ").append(s).append("\n");
        }
        System.out.println(sb);
    }
}
