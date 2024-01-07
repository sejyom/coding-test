import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int dx[] = new int[]{0, 1, 1, -1};
    static int dy[] = new int[]{1, 0, 1, 1};
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][n];

        for (int i = 0; i < n; i++)
            arr[i] = br.readLine().split("");

        System.out.println(findWinner(arr));
    }

    public static String findWinner(String[][] arr) {
        int nx, ny, count;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (!arr[i][j].equals(".")) {
                    for (int k = 0; k < dx.length; k++) {
                        count = 1;

                        for (int l = 1; l <= 2; l++) {
                            nx = j + l * dx[k];
                            ny = i + l * dy[k];

                            if (nx >= 0 && ny >= 0 && nx < n && ny < n && arr[i][j].equals(arr[ny][nx]))
                                count++;
                        }

                        if (count == 3)
                            return arr[i][j];
                    }
                }
            }
        }

        return "ongoing";
    }
}