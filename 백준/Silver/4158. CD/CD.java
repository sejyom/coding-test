import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr;
        int cd, result;

        while (true) {
            arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (arr[0] + arr[1] == 0)
                break;

            map.clear();
            result = 0;

            for (int i = 0; i < arr[0] + arr[1]; i++) {
                cd = Integer.parseInt(br.readLine());
                map.put(cd, map.getOrDefault(cd, 0) + 1);
            }

            for (int i : map.keySet())
                if (map.get(i) == 2)
                    result++;

            System.out.println(result);
        }
    }
}