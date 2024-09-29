package inflearn.dynamic_programming.최대점수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] dp = new int[M + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int ps = Integer.parseInt(st.nextToken());
            int pt = Integer.parseInt(st.nextToken());
            for (int j = M; j >= pt; j--) {
                dp[j] = Math.max(dp[j], dp[j - pt] + ps);
            }
        }
        System.out.println(dp[M]);
    }
}
