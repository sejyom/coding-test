import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static class Area {
        int x;
        int y;
        int height;

        public Area(int x, int y, int height) {
            this.x = x;
            this.y = y;
            this.height = height;
        }
    }

    static int[][] graph;
    static boolean[][] checked;
    static int n;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int currentMax = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        int result = 0;
        int height = 0;

        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < arr.length; j++) {
                graph[i][j] = arr[j];
                if (arr[j] > height)
                    height = arr[j];
            }
        }

        for (int h = 0; h <= height; h++) {
            currentMax = 0;
            checked = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!checked[i][j] && h < graph[i][j]) {
                        getSafetyZone(i, j, h);
                        currentMax++;
                    }
                }
            }
            result = Math.max(result, currentMax);
        }

        System.out.println(result);
    }


    public static void getSafetyZone(int cx, int cy, int height) {
        Queue<Area> queue = new LinkedList<>();
        queue.offer(new Area(cx, cy, graph[cx][cy]));
        int x, y;

        while (!queue.isEmpty()) {
            Area area = queue.poll();

            for (int i = 0; i < dx.length; i++) {
                x = area.x + dx[i];
                y = area.y + dy[i];

                if (x >= 0 && x < n && y >= 0 && y < n && !checked[x][y]) {
                    if (graph[x][y] > height) {
                        queue.offer(new Area(x, y, graph[x][y]));
                        checked[x][y] = true;
                    }
                }
            }
        }


    }
}
