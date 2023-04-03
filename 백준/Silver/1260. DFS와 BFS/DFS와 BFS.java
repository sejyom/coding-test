import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); //정점의 개수
        int cnt = scanner.nextInt(); //간선의 개수
        int start = scanner.nextInt(); //시작 노드
        int[][] graph = new int[num+1][num+1];
        boolean[] check = new boolean[num+1];

        for (int i = 0; i < cnt; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = graph[b][a] = 1; //인접노드 생성
        }

        dfs(graph, start, check, num);

        System.out.println();
        for (int i=0; i<check.length; i++)
            check[i] = false;

        bfs(graph, start, check, num);
    }
    public static void dfs(int[][] graph, int start, boolean[] check, int num) {
        check[start] = true;
        System.out.print(start + " ");
        for (int i = 1; i <= num; i++) {
            if (graph[start][i]==1 && check[i]==false)
                dfs(graph, i, check, num);
        }
    }
    public static void bfs(int[][] graph, int start, boolean[] check, int num) {
        Queue<Integer> queue = new LinkedList<>();
        int tmp;
        check[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            tmp = queue.poll();
            System.out.print(tmp + " ");
            for (int i = 1; i <= num; i++) {
                if (graph[tmp][i]==1 && check[i]==false) {
                    check[i]=true;
                    queue.offer(i);
                }
            }
        }
    }
}
