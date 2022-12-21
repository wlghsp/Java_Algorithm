package baekjoon.bronze.bronzeⅢ.boj18247_겨울왕국티켓예매;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if (N >= 12 && M >= 4) {
                System.out.println(12 * M - (M - 4));
            } else {
                System.out.println(-1);
            }
        }
    }
}
