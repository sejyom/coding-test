import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        int n;
        int[] arr, res = new int[t];

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n];
            st = new StringTokenizer(String.valueOf(br.readLine()));
            for (int j = 0; j < n; j++)
                arr[j] = Integer.parseInt(st.nextToken());
            res[i] = maxResult(arr);
        }

        for (int i : res)
            System.out.println(i);
    }

    public static int maxResult (int[] arr) {
        int max_result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.max(arr[i - 1] + arr[i], arr[i]);
            max_result = Math.max(arr[i], max_result);
        }
        return max_result;
    }
}