package codeup.simple_loop;

/*
영희는 수열에 대한 공부를 하고 있다.
하지만 영희는 수학을 잘 못해서 수열을 어려워하고 있어 프로그래밍으로 해결하려고 한다.
시작 값(a), 곱할 값(b), 더할 값(c), 몇 번째 항인지 나타내는 정수(n)이 입력으로 주어질 때, 수열의 n번째 항의 값을 구하시오.
예를 들어 시작값이 2, 곱할값이 -1, 더할 값이 3이고 5번째 항의 값을 구한다면,
1번째 항 : 2
2번째 항 : 2 * (-1) + 3 = 1
3번째 항 : 1 * (-1) + 3 = 2
4번째 항 : 2 * (-1) + 3 = 1
5번째 항 : 1 * (-1) + 3 = 2
이므로 5번째 항의 값은 2이다.

입력
시작값 a, b, c, n이 차례대로 입력된다.
( -9 <= a, b, c < = 9, 1 <= n <= 9)

출력
n번째 수열의 값을 출력한다.

입력 예시   
2 -1 3 5

출력 예시
2

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Codeup1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int result = a;
        for (int i = 0; i < n-1; i++) {
            result = result * b +c;
         }
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
