import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); //400
        int[] arr = new int[]{300, 60, 10};
        int[] res = new int[3];

        for (int i=0; i<arr.length; i++){
            if (t >= arr[i]){
                res[i] += t / arr[i];
                t %= arr[i];
            }
        }
        if (t != 0)
            System.out.println(-1);
        else {
            for (int i : res)
                System.out.print(i + " ");
        }
    }
}