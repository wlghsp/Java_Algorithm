package doitcodingtestjava.Boj11724_연결요소의개수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {


    static ArrayList<Integer>[] A;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //노드 개수
        int m = Integer.parseInt(st.nextToken()); //엣지 개수


        A = new ArrayList[n + 1]; // 그래프 저장 인접리스트
        visited = new boolean[n + 1]; // 방문기록 저장 배열

        for (int i = 1; i < n+1; i++) { // n의 개수만큼 반복하기, 1 ~ n 까지
            A[i] = new ArrayList<>(); // 인접 리스트에 그래프 데이터 저장하기
        }

        for (int i = 0; i < m; i++) { // m의 개수만큼 반복하기
            // 인접리스트에 그래프 데이터 저장하기
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e); // 양방향 엣지이므로 양쪽에 엣지를 더하기
            A[e].add(s);
        }

        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) { // 방문하지 않은 노드가 없을 때까지 반복하기
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    static void DFS(int v) {
        if (visited[v]) {
            return;
        }

        visited[v] = true;
        for (int i : A[v]) {
            if (visited[i]== false) { // 연결 노드 중 방문하지 않았던 노드만 탐색하기
                DFS(i);
            }
        }
    }
}
