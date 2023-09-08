import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 30; i++)
            arr.add(i);

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            if (arr.contains(num))
                arr.remove(Integer.valueOf(num));
        }
        Collections.sort(arr);
        for (int i : arr)
            System.out.println(i);
    }
}
