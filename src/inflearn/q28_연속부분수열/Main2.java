package inflearn.q28_연속부분수열;

import java.util.Scanner;

public class Main2 {

    private int solution(int n, int m, int[] arr) {
        int answer = 0, lt = 0 ,sum = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];

            if (sum == m) answer++;

            while (sum >= m) {
                sum -= arr[lt++];

                if (sum==m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,m,arr));
    }
}
