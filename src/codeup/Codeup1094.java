package codeup;


/*

정보 선생님은 수업을 시작하기 전에 이상한 출석을 부른다.

학생들의 얼굴과 이름을 빨리 익히기 위해 번호를 무작위(랜덤)으로 부르는데,
영일이는 선생님이 부른 번호들을 기억하고 있다가 거꾸로 불러보는 것을 해보고 싶어졌다.

출석 번호를 n번 무작위로 불렀을 때, 부른 번호를 거꾸로 출력해 보자.


참고
배열에 순서대로 기록해 두고, 기록된 내용을 거꾸로 출력하면 된다.

예시
int n, i;
int a[1000]={};
scanf("%d", &n); //개수 입력 받기
for(i=1; i<=n; i++) //개수 만큼 입력 받기
  scanf("%d", &a[i]); //읽어서 순서대로 배열에 넣는다.

for(i=n; i>=1; i--)
  printf("%d ", a[i]); //i 번 배열에 저장되어 있는 값 출력하기




입력
번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.




출력
출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다. 

10
10 4 2 3 6 6 7 9 8 5

5 8 9 7 6 6 3 2 4 10

*/
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1094 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int[] called = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < called.length; i++) {
      called[i] = Integer.parseInt(st.nextToken());
    }

    StringBuilder sb = new StringBuilder();
    for (int i = n-1; i >= 0; i--) {
      sb.append(called[i]).append(" ");
    }
  
    bw.write(sb + "");
    bw.flush();
    bw.close();
    br.close();
  }
}
