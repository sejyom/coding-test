import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    public static class Tomato {
        int x;
        int y;
        int day;

        public Tomato(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    static int m, n;
    static int[][] graph;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1}; //상, 하, 좌, 우
    static Queue<Tomato> path = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        graph = new int[n][m];

        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < m; j++) {
                graph[i][j] = arr[j];
                if (graph[i][j] == 1)
                    path.add(new Tomato(i, j, 0));
            }
        }

        System.out.println(findMinimumRipeningDateForTomatoes());
    }

    public static int findMinimumRipeningDateForTomatoes() {
        int x, y, days = 0;

        while(!path.isEmpty()) {
            Tomato tomato = path.poll();
            days = tomato.day;

            for (int k = 0; k < 4; k++) {
                x = dx[k] + tomato.x;
                y = dy[k] + tomato.y;

                if (x >= 0 && x < n && y >= 0 && y < m && graph[x][y] == 0) {
                    graph[x][y] = 1;
                    path.offer(new Tomato(x, y, days + 1));
                }
            }
        }

        return isAllChecked() ? days : -1;
    }

    public static boolean isAllChecked() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0)
                    return false;
            }
        }
        return true;
    }
}
