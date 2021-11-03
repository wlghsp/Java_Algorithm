package codeup;


/*
어떤 규칙에 따라 수를 순서대로 나열한 것을 수열(series)이라고 한다.

예를 들어
1 4 7 10 13 16 19 22 25 ... 은
1부터 시작해 이전에 만든 수에 3을 더해 다음 수를 만든 수열이다.
이러한 것을 수학에서는 앞뒤 수들의 차이가 같다고 하여

등차(차이가 같다의 한문 말) 수열이라고 한다.
수열을 알게 된 영일이는 갑자기 궁금해졌다.

"그럼.... 123번째 나오는 수는 뭘까?"

영일이는 프로그램을 만들어 더 큰 수도 자동으로 계산하고 싶어졌다.

시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때
n번째 수를 출력하는 프로그램을 만들어보자. 

입력
시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가
공백을 두고 입력된다.(모두 0 ~ 100)

출력
n번째 수를 출력한다.

1 3 5

13

*/
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1089 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int d = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    
    int result = a + (n-1) * d;

    bw.write(result + "");
    bw.flush();
    bw.close();
    br.close();
  }
}
