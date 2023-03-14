import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            num = Integer.parseInt(br.readLine());
            arr[i] = num % 42;
        }

        Set<Integer> hs = new HashSet<Integer>();
        for (int i : arr)
            hs.add(i);

        System.out.println(hs.size());
        br.close();
    }
}