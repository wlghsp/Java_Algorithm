package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
입력된 정수 두 개를 비트단위로 xor 연산한 후 그 결과를 정수로 출력해보자.
비트단위(bitwise) 연산자 ^(xor, circumflex/caret, 서컴플렉스/카릿)를 사용하면 된다.


3 5

6

*/

public class Codeup1062 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a^b);
    }
}
