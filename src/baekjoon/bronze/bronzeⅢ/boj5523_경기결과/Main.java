package baekjoon.bronze.bronzeⅢ.boj5523_경기결과;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int aWin = 0;
        int bWin = 0;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a > b) aWin++;
            else if (b > a) bWin++;
        }
        System.out.println(aWin + " " + bWin);
    }
}
