package inflearn.q19_점수계산;

import java.util.Scanner;

public class Main {

    public int solution(int[] a) {
        int answer = 0, cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]== 1) {
                cnt++;
                answer+=cnt;
            } else cnt = 0;
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(T.solution(a));
    }
}
