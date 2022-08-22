package inflearn.Recursive_Tree_Graph_DFS_BFS_기초.q59_이진트리레벨탐색_BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node  {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main {
    Node root;
    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0; // 레벨
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                // 자식 넣기, 말단 노드가 아닌 경우 null이 아니므로
                // 왼쪽과 오른쪽 자식을 넣는다.
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
            L++;
            System.out.println(); // 레벨 출력을 위한 줄 바꿈
        }

    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);

    }
}
