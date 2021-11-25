package programmers.level1;

/*
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
제한 사항

    두 수는 1이상 1000000이하의 자연수입니다.

입출력 예
n 	m 	return
3 	12 	[3, 12]
2 	5 	[1, 10]

입출력 예 설명

입출력 예 #1
위의 설명과 같습니다.

입출력 예 #2
자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.


 */


import java.util.Arrays;

public class 최대공약수와최소공배수 {

    static int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = GCD1(n, m);
        answer[1] = LCM(n, m);
        return answer;
    }

    static int GCD(int a, int b) {
        int tmp, n;
        // a에 큰값을 위치시키기 위한 조건문
        if (a < b){
            tmp = a;
            a = b;
            b = tmp;
        }
        // 유클리드 알고리즘
        // b가 0이 될때까지 반복, b가 0인 순간의 a 를 GCD로 판단
        while (b != 0){
             n = a % b;
             a = b;
             b = n;
        }
        return a;
    }
    // 재귀
    static int GCD1(int a, int b) {

        return b != 0 ? GCD1(b, a % b) : a;
    }


    static int LCM(int a, int b) { // 최소공배수
        return a * b / GCD1(a, b);
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
    }
}
