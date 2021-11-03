package codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
빨강(red), 초록(green), 파랑(blue) 빛을 섞어
여러 가지 빛의 색을 만들어 내려고 한다.

빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때,
(빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수 있다.)

주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과
총 가짓 수를 계산해보자.


예시
int i, j, k, c=0;
int r, g, b;
scanf("%d%d%d”, &r, &g, &b);

for(i=0; i<r; i++)
  for(j=0; j<g; j++)
    for(k=0; k<b; k++)
    {
      printf("%d %d %d\n", i, j, k);
      c++;
    }

printf("%d ", c);


입력
빨녹파(r, g, b) 각 빛의 강약에 따른 가짓수(0 ~ 128))가 공백을 사이에 두고 입력된다.
예를 들어, 3 3 3 은 각 색깔 빛에 대해서 그 강약에 따라 0~2까지 3가지의 색이 있음을 의미한다.


출력
만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.


2 2 2


0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1
8
*/

public class Codeup1084 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int r = Integer.parseInt(st.nextToken());
    int g = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int count = 0;
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < g; j++) {
        for (int k = 0; k < b; k++) {
          bw.write(i + " " + j + " " + k + "\n");
          count++;
        }
      }
    }
    bw.write(count + "");
    bw.flush();
    bw.close();
    br.close();
  }
}
