package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n; // n개의 숫자 입력
    static int check[], cal[]; // 0: 덧셈, 1:뺄셈, 2:곱셈, 3:나눗셈
    static int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE; // 최댓값과 최솟값을 저장 할 변수


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        check = new int[n]; // 숫자가 저장 될 배열을 할당
        cal = new int[4]; // 연산자가 저장 될 배열을 할당

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            check[i] = Integer.parseInt(st.nextToken());
        }
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) { // 연산자의 갯수는 4개
            cal[i] = Integer.parseInt(st1.nextToken());
        }

        dfs(check[0], 1);   // DFS 호출
        System.out.println(max);
        System.out.println(min);

    }

    static void dfs(int num, int idx){  // 최초 첫 번째 숫자, 1번 인덱스가 전달

        if (idx == n) { // DFS 종료 부, 마지막 인덱스에서 재귀호출을 실행하면 이 부분에서 걸린다.
            if (num>max) { // 최종적인 결과 같이 num값에 저장되므로 최댓값과 최솟값을 찾는다.
                max = num;
            }
            if (num < min) {
                min = num;
            }
            return;
        }
        
        int result = 0; // 한 번의 연산자를 사용한 결과가 저장 될 변수
        for (int j = 0; j < 4; j++) {   // 연산자 배열을 탐색
            if (cal[j] != 0) { // 연산자가 존재하는 경우
                cal[j]--;      // 해당 연산자의 값을 -1 해준다.

                switch (j) {   // 각 연산자에 맞는 케이스로 이동
                    case 0:
                        result = num + check[idx];
                        break;
                    case 1:
                        result = num - check[idx];
                        break;
                    case 2:
                        result = num * check[idx];
                        break;
                    case 3:
                        if (num < 0 && check[idx]>0) {  // 음수를 양수로 나누는 경우에는 
                            num *= -1;  //음수를 양수로 바꾼 뒤
                            result = num / check[idx]; // 몫을 취하고
                            result *= -1;                // 해당 몫을 음수화
                        } else {
                            result = num / check[idx];  // 일반적인 경우에는 몫만 취하게 된다.
                            break;
                        }
                }
                dfs(result, idx+1); // 연산의 결과와 인덱스를 증가시켜 전달
                cal[j]++; // 한 번의 경우를 모두 탐색한 후에는 다시 감소시켰던 연산자 값을 + 1, 백트래킹
            }
        }
        
    }
}
