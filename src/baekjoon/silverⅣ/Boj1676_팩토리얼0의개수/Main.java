package baekjoon.silverⅣ.Boj1676_팩토리얼0의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (N >=5) {
            cnt += N / 5;

            N /= 5;
        }
        System.out.println(cnt);

    }
}
