package codeup.two_dim_array;

/*
다음과 같은 n*n 배열 구조를 출력해보자.

입력이 3인 경우 다음과 같이 출력한다.
3 6 9
2 5 8
1 4 7

입력이 5인 경우는 다음과 같이 출력한다.
5 10 15 20 25
4 9 14 19 24
3 8 13 18 23
2 7 12 17 22
1 6 11 16 21

입력이 n인 경우의 2차원 배열을 출력해보자.

입력
 첫 번째 줄에 배열의 크기 n이 입력된다.
[입력값의 정의역]
1<= n <= 100

출력
n*n 크기의 배열을 설명과 같이 채워 출력한다.

입력 예시
4

출력 예시
4 8 12 16
3 7 11 15
2 6 10 14
1 5 9 13

*/

import java.io.*;

public class Codeup1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); // 숫자 n 받기

        int[][] arr = new int[101][101]; // 입력값이 1~100까지 이므로 101


        for (int i = 1; i <= n; i++) {
            int k = n- i + 1; // n에서 1씩 감소하게 하는 코드
            for (int j = 1; j <= n; j++) {
                arr[i][j] = k;
                k += n;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
