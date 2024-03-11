import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static class Tomato {
        int x;
        int y;
        int z;
        int day;

        public Tomato(int x, int y, int z, int day) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.day = day;
        }
    }

    public static int[] dx = {-1, 1, 0, 0, 0, 0};
    public static int[] dy = {0, 0, -1, 1, 0, 0};
    public static int[] dz = {0, 0, 0, 0, -1, 1};
    public static int m, n, h;
    public static int maxDays = 0;
    public static Queue<Tomato> queue = new LinkedList<>();
    public static int[][][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        graph = new int[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int k = 0; k < m; k++) {
                    graph[i][j] = arr;
                    if (arr[k] == 1)
                        queue.add(new Tomato(j, k, i, 0));
                }
            }
        }

        if (!queue.isEmpty())
            repeningTomatoes();
        System.out.println(isAllChecked() ? maxDays : -1);
    }

    public static void repeningTomatoes() {
        int x, y, z, days;

        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();
            days = tomato.day;

            for (int i = 0; i < 6; i++) {
                x = dx[i] + tomato.x;
                y = dy[i] + tomato.y;
                z = dz[i] + tomato.z;

                if (x >= 0 && x < n && y >= 0 && y < m && z >= 0 && z < h && graph[z][x][y] == 0) {
                    graph[z][x][y] = 1;
                    queue.offer(new Tomato(x, y, z, days + 1));

                    if (days + 1 > maxDays)
                        maxDays = days + 1;
                }
            }
        }
    }

    public static boolean isAllChecked() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (graph[i][j][k] == 0)
                        return false;
                }
            }
        }

        return true;
    }
}
