import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static boolean[][] checked;
    static int[] dm = {-1, 1, 0, 0}; //상하좌우
    static int[] dn = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int m, n, k;


        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); //가로
            n = Integer.parseInt(st.nextToken()); //세로
            k = Integer.parseInt(st.nextToken()); //배추 개수
            graph = new int[m][n];
            checked = new boolean[m][n];
            int count = 0;

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                graph[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            for (int x = 0; x < m; x++) {
                for (int y = 0; y < n; y++) {
                    if (graph[x][y] == 1 && !checked[x][y]) {
                        getNumberOfCaterpillars(x, y);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void getNumberOfCaterpillars(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        checked[x][y] = true;
        queue.offer(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            for (int i = 0; i < dm.length; i++) {
                if (poll[0] + dm[i] >= 0 && poll[0] + dm[i] < graph.length && poll[1] + dn[i] >= 0 && poll[1] + dn[i] < graph[i].length) {
                    if (graph[poll[0] + dm[i]][poll[1] + dn[i]] == 1 && !checked[poll[0] + dm[i]][poll[1] + dn[i]]) {
                        checked[poll[0] + dm[i]][poll[1] + dn[i]] = true;
                        queue.offer(new int[]{poll[0] + dm[i], poll[1] + dn[i]});
                    }
                }
            }
        }
    }
}
