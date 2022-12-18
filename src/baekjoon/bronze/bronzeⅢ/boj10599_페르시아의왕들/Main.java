package baekjoon.bronze.bronzeⅢ.boj10599_페르시아의왕들;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0 && d == 0) break;
            int minVal = c - b;
            int maxVal = d - a;
            System.out.printf("%d %d\n", minVal, maxVal);
        }
    }
}
