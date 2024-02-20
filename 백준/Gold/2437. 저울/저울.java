import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        System.out.println(findMinimum(arr));

    }

    public static int findMinimum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum + 1 < arr[i])
                return sum + 1;
            sum += arr[i];
        }

        return sum + 1;
    }

}
