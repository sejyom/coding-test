import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int min;

        for (int i = 0; i < 5; i++)
            arr[i] = Integer.parseInt(br.readLine());

        min = arr[0];
        for (int i = 0; i < 3; i++) {
            if (min > arr[i])
                min = arr[i];
        }

        System.out.println((min + Math.min(arr[3], arr[4])) - 50);
        br.close();
    }
}
