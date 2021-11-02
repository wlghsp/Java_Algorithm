package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
입력된 정수 두 개를 비트단위로 and 연산한 후 그 결과를 정수로 출력해보자.
비트단위(bitwise)연산자 &를 사용하면 된다.(and, ampersand, 앰퍼센드라고 읽는다.)


3 5

1

*/

public class Codeup1060 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a&b);
    }
}
