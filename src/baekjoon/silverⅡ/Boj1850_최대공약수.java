package baekjoon.silverⅡ;


/*
모든 자리가 1로만 이루어져있는 두 자연수 A와 B가 주어진다. 이때, A와 B의 최대 공약수를 구하는 프로그램을 작성하시오.
예를 들어, A가 111이고, B가 1111인 경우에 A와 B의 최대공약수는 1이고, A가 111이고, B가 111111인 경우에는 최대공약수가 111이다.

입력
첫째 줄에 두 자연수 A와 B를 이루는 1의 개수가 주어진다. 입력되는 수는 263보다 작은 자연수이다.

출력
첫째 줄에 A와 B의 최대공약수를 출력한다. 정답은 천만 자리를 넘지 않는다.

3 4

1

3 6

111

500000000000000000 500000000000000002

11


 */

import java.io.*;
import java.util.StringTokenizer;

public class Boj1850_최대공약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        StringBuilder sb = new StringBuilder();
        long gcd =  GCD(a, b);
        for (int i = 0; i < gcd; i++) {
            sb.append("1");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
    static long GCD(long a, long b) {
        return b != 0 ? GCD(b,a % b) : a;
    }
}
