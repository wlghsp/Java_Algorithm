package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.
비트단위(bitwise)연산자 ~ 를 붙이면 된다.(~ : tilde, 틸드라고 읽는다.)

2

-3

*/

public class Codeup1059 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(~a);
    }
}
