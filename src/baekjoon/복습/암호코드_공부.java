package baekjoon.복습;

/*
25114

6

1111111111

89


 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 암호코드_공부 {

    public static void main(String[] args) throws IOException {
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();

        int length = str.length();

        long[] dp = new long[length + 1];

        dp[0] = dp[1] = 1;

        if (str.charAt(0) == '0') System.out.print(0); //입력값이 0으로 시작
        else if(str.charAt(length-1) == '0' && str.charAt(length -2) != '1' && str.charAt(length -2) != '2') System.out.print(0);

        else {

            for (int i = 2; i <= length; i++) {

                int tmp = Integer.parseInt(String.valueOf(str.charAt(i-1)));
                if (tmp > 0 ) dp[i] = dp[i-1] % 1000000;

                tmp += Integer.parseInt(String.valueOf(str.charAt(i-2))) * 10;
                if (10<= tmp && tmp <= 26) dp[i] = (dp[i] + dp[i-2]) % 1000000;
            }

            System.out.print(dp[length]);
        }



    }
}
