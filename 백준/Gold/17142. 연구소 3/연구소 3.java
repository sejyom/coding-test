import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Virus {
        int x;
        int y;
        int sec;

        public Virus(int x, int y, int sec) {
            this.x = x;
            this.y = y;
            this.sec = sec;
        }
    }

    static int n, m;
    static String[][] graph;
    static boolean[][] checked;
    static Queue<Virus> queue;
    static List<int[]> virus;
    static int[][] comb;
    static int zero = 0;
    static int result = Integer.MAX_VALUE;
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new String[n][n];
        virus = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph[i] = br.readLine().split(" ");

            for (int j = 0; j < n; j++) {
                if (graph[i][j].equals("2"))
                    virus.add(new int[]{i, j});
                else if (graph[i][j].equals("0"))
                    zero++;
            }
        }

        if (zero == 0) {
            System.out.println(zero);
        } else {
            comb = new int[m][2];
            getComb(0, 0);
            if (result == Integer.MAX_VALUE)
                System.out.println(-1);
            else System.out.println(result);
        }
    }

    public static void getComb(int start, int depth) {
        if (depth == m) {
            queue = new LinkedList<>();
            checked = new boolean[n][n];
            getMin(zero);

            return ;
        }

        for (int i = start; i < virus.size(); i++) {
            comb[depth] = virus.get(i);
            getComb(i + 1, depth + 1);
        }
    }

    public static void getMin(int zero) {
        for (int i = 0; i < comb.length; i++)
            queue.add(new Virus(comb[i][0], comb[i][1], 0));

        int x, y, sec;

        while (!queue.isEmpty()) {
            Virus current = queue.poll();
            sec = current.sec;
            checked[current.x][current.y] = true;

            for (int i = 0; i < dx.length; i++) {
                x = dx[i] + current.x;
                y = dy[i] + current.y;

                if (x >= 0 && x < n && y >= 0 && y < n && !graph[x][y].equals("1") && !checked[x][y]) {
                    if (graph[x][y].equals("0"))
                        zero--;

                    if (zero == 0)
                        result = Math.min(result, sec + 1);

                    checked[x][y] = true;
                    queue.offer(new Virus(x, y, sec + 1));
                }
            }
        }
    }
}