package codeup.recursion;

/*
시작수(a)와 마지막 수(b)가 입력되면
a부터 b까지의 모든 홀수를 출력하시오.

이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
금지 키워드 : for while goto

입력
두 수 a, b 가 입력된다. (1<=a<=b<=100)

출력
a~b의 홀수를 모두 출력한다.

입력 예시   
2 7

출력 예시
3 5 7 

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Codeup1904 {
    static int a;
    static void recur(int k) {
       if (k == a-1) {
           return;
       }
       recur(k - 1);
       if (k % 2 != 0) {
         System.out.println(k);
       }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        recur(b);
    }
}
