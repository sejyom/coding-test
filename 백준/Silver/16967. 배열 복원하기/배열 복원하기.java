import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[][] b = new int[h + x][w + y];

        for (int i = 0; i < b.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < b[i].length; j++)
                b[i][j] =Integer.parseInt(st.nextToken());
        }

        for (int i = x; i < h; i++) {
            for (int j = y; j < w; j++) {
                b[i][j] -= b[i - x][j - y];
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
}
