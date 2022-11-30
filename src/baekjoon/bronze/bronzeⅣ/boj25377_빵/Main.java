package baekjoon.bronze.bronzeⅣ.boj25377_빵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int minTime = Integer.MAX_VALUE;
        boolean success = false;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (b >= a) {
                if (minTime > b) {
                    minTime = b;
                    success = true;
                }
            }
        }
        System.out.println(success ? minTime : -1);
    }
}
