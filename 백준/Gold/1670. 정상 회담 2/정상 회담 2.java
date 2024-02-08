import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] DP = new long[N + 1];
        final long div = 987654321;

        DP[0] = 1;
        DP[2] = 1;

        for(int i=4; i<=N; i += 2) {
            for(int j=0; j<=i-2; j += 2) {
                DP[i] += DP[j] * DP[i-j-2];
                DP[i] %= div;
            }
        }

        System.out.println(DP[N]);
    }
}
