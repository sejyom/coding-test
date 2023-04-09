import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //남은 일수
        int[] t = new int[n]; //걸리는 일자
        int[] p = new int[n]; //보수
        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
            p[i] = scanner.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            if (i + t[i] <= n) // t[i]만큼의 상담일 후에도 퇴사일을 초과하지 않을 때, 상담 진행
                dp[i] = Math.max(dp[i + 1], p[i] + dp[i + t[i]]);
            else //초과
                dp[i] = dp[i+1];
        }

        System.out.println(dp[0]);

    }
}