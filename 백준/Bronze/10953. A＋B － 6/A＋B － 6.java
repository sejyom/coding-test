import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] res = new int[num];
        for (int i = 0; i < num; i++) {
            String[] arr = br.readLine().split(",");
            res[i] = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        }
        for(int i : res)
            System.out.println(i);
    }
}
