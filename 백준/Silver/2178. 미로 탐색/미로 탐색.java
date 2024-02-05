import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static boolean[][] checked;
    static int m, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        checked = new boolean[n][m];
        String[] tmp;

        for (int i = 0; i < n; i++) {
            tmp = br.readLine().split("");
            for (int j = 0; j < m; j++)
                graph[i][j] = Integer.parseInt(tmp[j]);
        }

        System.out.println(srchMaze(0, 0));
    }

    public static int srchMaze(int cx, int cy) {
        int indeed = 1, x, y;
        int[] dx = {-1, 1, 0, 0}; //상하좌우
        int[] dy = {0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{cx, cy});
        checked[cx][cy] = true;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            for (int i = 0; i < dx.length; i++) {
                x = poll[0] + dx[i];
                y = poll[1] + dy[i];
                if (x >= 0 && x < n && y >= 0 && y < m) {
                    if (graph[x][y] != 0 && !checked[x][y]) {
                        checked[x][y] = true;
                        graph[x][y] = graph[poll[0]][poll[1]] + 1;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
        }

        return graph[n - 1][m - 1];
    }
}
