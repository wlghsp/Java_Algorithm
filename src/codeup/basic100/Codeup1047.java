package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
문제 설명   
정수 1개를 입력받아 2배 곱해 출력해보자.

참고
*2 의 값을 출력해도 되지만,
정수를 2배로 곱하거나 나누어 계산해 주는 비트단위시프트연산자 <<, >>를 이용한다.

2진수 형태로 저장되어 있는 값들을 왼쪽(<<)이나 오른쪽(>>)으로
지정한 비트 수만큼 밀어주면 2배씩 늘어나거나 반으로 줄어드는데,

왼쪽 비트시프트(<<)가 될 때에는 오른쪽에 0이 주어진 개수만큼 추가되고,

오른쪽 비트시프트(>>)가 될 때에는
왼쪽에 0(0 또는 양의 정수인 경우)이나 1(음의 정수인 경우)이 개수만큼 추가된다.

범위(32비트)를 넘어서 이동되는 비트는 삭제된다.

예시
int a=10;
printf("%d", a<<1); //10을 2배 한 값인 20 이 출력된다.
printf("%d", a>>1); //10을 반으로 나눈 값인 5 가 출력된다.
printf("%d", a<<2); //10을 4배 한 값인 40 이 출력된다.
printf("%d", a>>2); //10을 반으로 나눈 후 다시 반으로 나눈 값인 2 가 출력된다. 

1024

2048

*/

public class Codeup1047 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("%d%n", a<<1);  // 1 왼쪽 비트시프트 값이 2배가 됨
        System.out.printf("%d%n", a>>1);  // 1 오른쪽 비트시프트 값이 반이 됨
        System.out.printf("%d%n", a<<2);  // 2 왼쪽 비트시프트 값이 4배
        System.out.printf("%d%n", a>>2);  // 2 오른쪽 비트시프트 값이 1/4
        
       
    }
}
