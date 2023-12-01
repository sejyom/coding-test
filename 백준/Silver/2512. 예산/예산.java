import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        List<Integer> lst = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        int budget = Integer.parseInt(br.readLine());

        System.out.println(findLimit(count, lst, budget));

    }

    public static int findLimit(int count, List<Integer> lst, int budget) {
        int left = 0;
        int right = lst.get(count - 1);
        int mid;
        int sum;
        int limit = 0;

        while (left <= right) {
            sum = 0;
            mid = (left + right) / 2;

            for (int i : lst)
                sum += Math.min(i, mid);

            if (sum <= budget) {
                limit = mid;
                left = mid + 1;
            } else
                right = mid - 1;

        }

        return limit;
    }
}