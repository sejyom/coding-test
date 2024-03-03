import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static class Object {
        int x;
        int y;
        int distance;

        public Object(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    static int n, m;
    static int[][] graph;
    static boolean[][] checked;
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        checked = new boolean[n][m];
        int cx = 0, cy = 0;

        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < m; j++) {
                graph[i][j] = arr[j];
                if (graph[i][j] == 2) {
                    cx = i;
                    cy = j;
                    graph[i][j] = 0;
                }
            }
        }

        findShortestDistance(cx, cy);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!checked[i][j] && graph[i][j] != 0)
                    graph[i][j] = -1;
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void findShortestDistance(int cx, int cy) {
        int x, y;
        Queue<Object> queue = new LinkedList<>();
        queue.offer(new Object(cx, cy, 0));

        while (!queue.isEmpty()) {
            Object poll = queue.poll();

            for (int i = 0; i < dx.length; i++) {
                x = dx[i] + poll.x;
                y = dy[i] + poll.y;

                if (x >= 0 && x < n && y >= 0 && y < m && !checked[x][y] && graph[x][y] != 0) {
                    checked[x][y] = true;
                    graph[x][y] = poll.distance + 1;
                    queue.offer(new Object(x, y, poll.distance + 1));
                }
            }
        }
    }
}
