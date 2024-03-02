import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int n;
    static char[][] graph;
    static boolean[][] checked;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        graph = new char[n][n];
        int count = 0;

        for (int i = 0; i < n; i++)
            graph[i] = br.readLine().toCharArray();

        checked = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!checked[i][j]) {
                    bfs(i, j);
                    count++;
                }

                if (graph[i][j] == 'R')
                    graph[i][j] = 'G';
            }
        }

        sb.append(count + " ");

        checked = new boolean[n][n];
        count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!checked[i][j]) {
                    bfs(i, j);
                    count++;
                }
            }
        }

        System.out.println(sb.append(count));
    }

    public static void bfs(int cx, int cy) {
        int x, y;
        int[] poll;
        char c = graph[cx][cy];

        queue.offer(new int[]{cx, cy});

        while (!queue.isEmpty()) {
            poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                x = dx[i] + poll[0];
                y = dy[i] + poll[1];

                if (x >= 0 && x < n && y >= 0 && y < n && !checked[x][y]) {
                    if (graph[x][y] == c) {
                        queue.offer(new int[]{x, y});
                        checked[x][y] = true;
                    }
                }
            }
        }
    }
}
