import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //물건 개수
        int k = scanner.nextInt(); //최대 무게
        int[] w = new int[n+1]; //각 물건의 무게
        int[] v = new int[n+1]; //각 물건의 가치
        int[][] dp = new int[n+1][k+1];
        int max = 0;

        for (int i = 1; i <= n; i++) {
            w[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }
        
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                if (w[i] <= j) // 물건의 무게가 j(현 최대 배낭 무게)를 초과하지 않을 때 -> 물건을 넣을 수 있음
                    dp[i][j] = Math.max(dp[i-1][j], v[i]+dp[i-1][j-w[i]]);
                else // w[i] > j 물건의 무게가 j(현 최대 배낭 무게)를 초과할 때 -> 물건을 넣을 수 없으므로 이전 값을 그대로 적용
                    dp[i][j]=dp[i-1][j];
                max = Math.max(dp[i][j], max);
            }
        }
        
        System.out.println(max);
    }
}
