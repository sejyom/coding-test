import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(br.readLine());
            System.out.println(revenue(arr));
        }

    }
    public static int revenue(int[] arr) {
        int sum = 0;
        int result = Integer.MIN_VALUE;

        for (int i : arr) {
            sum += i;
            result = Math.max(sum, result);
            if (sum < 0)
                sum = 0;
        }

        return result;
    }
}
