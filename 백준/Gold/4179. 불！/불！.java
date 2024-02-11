import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int r, c;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static String[][] graph;
    static Queue<int[]> fire = new LinkedList<>();
    static Queue<int[]> path = new LinkedList<>();
    static boolean[][] pathChecked;
    static boolean[][] fireChecked;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        graph = new String[r][c];
        pathChecked = new boolean[r][c];
        fireChecked = new boolean[r][c];
        int cx = 0, cy = 0;

        for (int i = 0; i < r; i++) {
            String[] tmp = br.readLine().split("");
            for (int j = 0; j < c; j++) {
                graph[i][j] = tmp[j];
                if (graph[i][j].equals("J")) {
                    cx = i;
                    cy = j;
                } else if (graph[i][j].equals("F"))
                    fire.offer(new int[]{i, j});
            }
        }

        System.out.println(getPath(cx, cy));
    }

    public static String getPath(int cx, int cy) {
        int x, y, count = 1;
        int[] tmp;
        path.offer(new int[]{cx, cy});

        if (cx == 0 || cy == 0 || cx == r - 1 || cy == c - 1)
            return String.valueOf(count);

        while (!path.isEmpty()) {
            spreadFire();

            count++;
            int size = path.size();
            for (int i = 0; i < size; i++) {
                tmp = path.poll();

                for (int j = 0; j < dx.length; j++) {
                    x = tmp[0] + dx[j];
                    y = tmp[1] + dy[j];

                    if (x >= 0 && x < r && y >= 0 && y < c) {
                        if (graph[x][y].equals(".") && !pathChecked[x][y]) {
                            if (x == r - 1 || y == c - 1 || x == 0 || y == 0)
                                return String.valueOf(count);

                            graph[x][y] = "J";
                            pathChecked[x][y] = true;
                            path.offer(new int[]{x, y});
                        }
                    }
                }
            }
        }

        return "IMPOSSIBLE";
    }

    public static void spreadFire() {
        int x, y;
        int[] tmp;
        int size = fire.size();

        for (int i = 0; i < size; i++) {
            tmp = fire.poll();

            for (int j = 0; j < dx.length; j++) {
                x = tmp[0] + dx[j];
                y = tmp[1] + dy[j];

                if (x >= 0 && x < r && y >= 0 && y < c) {
                    if (!graph[x][y].equals("#") && !fireChecked[x][y]) {
                        fireChecked[x][y] = true;
                        graph[x][y] = "F";
                        fire.offer(new int[]{x, y});
                    }
                }
            }
        }
    }
}
