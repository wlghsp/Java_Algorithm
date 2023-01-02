package baekjoon.bronze.bronzeⅡ.boj5598_카이사르암호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 3;
            if (num < 65) num += 26;
            sb.append((char)(num));
        }
        System.out.println(sb);
    }
}
