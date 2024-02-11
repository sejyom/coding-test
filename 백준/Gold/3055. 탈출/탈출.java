import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int r, c, x, y;
    static String[][] graph;
    static Queue<int[]> path = new LinkedList<>();
    static Queue<int[]> water = new LinkedList<>();

    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        graph = new String[r][c];
        int cx = 0, cy = 0;

        for (int i = 0; i < r; i++) {
            String[] tmp = br.readLine().split("");

            for (int j = 0; j < c; j++) {
                graph[i][j] = tmp[j];

                if (graph[i][j].equals("S")) {
                    cx = i;
                    cy = j;
                } else if (graph[i][j].equals("*"))
                    water.offer(new int[]{i, j});
            }
        }
        
        System.out.println(getShortestTime(cx, cy));
    }

    public static String getShortestTime(int cx, int cy) {
        int count = -1;

        path.offer(new int[]{cx, cy});

        while (!path.isEmpty()) {

            spreadingWater();

            int size = path.size();

            count++;
            for (int s=0; s<size; s++) {

                int[] tmp = path.poll();
                for (int i = 0; i < dx.length; i++) {
                    x = tmp[0] + dx[i];
                    y = tmp[1] + dy[i];

                    if (x >= 0 && x < r && y >= 0 && y < c) { //유효값이면서
                        if (graph[x][y].equals("D"))
                            return String.valueOf(++count);
                        else if (graph[x][y].equals(".")) { //.일때
                            path.offer(new int[]{x, y});
                            graph[x][y] = "S";
                        }
                    }
                }
            }
        }

        return "KAKTUS";
    }

    public static void spreadingWater() {
        int size = water.size(); //분

        for (int i = 0; i < size; i++) {
            int[] tmp = water.poll();

            for (int j = 0; j < dx.length; j++) {
                x = tmp[0] + dx[j];
                y = tmp[1] + dy[j];

                if (x >= 0 && x < r && y >= 0 && y < c) {
                    if (graph[x][y].equals(".")) {
                        graph[x][y] = "*";
                        water.offer(new int[]{x, y});
                    }
                }
            }
        }
    }
}
