import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int a;
    static int[][] arr;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        arr = new int[a + 1][a + 1];
        check = new boolean[a+1];
        int count = 0;

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            arr[n][m] = arr[m][n] = 1; //연결
        }

        for (int i = 1; i <= a; i++) {
            if (!check[i]) { //방문하지 않았으면 탐색하기
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void dfs(int index) {
        if (check[index])
            return ;
        else {
            check[index] = true;
            for (int i = 1; i <= a; i++) {
                if (arr[index][i] == 1)
                    dfs(i);
            }
        }
    }

}
