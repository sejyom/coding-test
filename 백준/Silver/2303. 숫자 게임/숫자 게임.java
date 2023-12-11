import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> lst = new ArrayList<>();
        int result = 0;
        int maxNum = 0;

        for (int n = 0; n < N; n++) {
            lst.clear();
            lst = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            maxNum = Math.max(findMaxNum(lst), maxNum);

            if (maxNum <= findMaxNum(lst))
                result = n + 1;

        }

        System.out.println(result);
    }

    public static int findMaxNum(List<Integer> lst) {
        int maxNum = 0;

        for (int i = 0; i < lst.size() - 2; i++) {
            for (int j = i + 1; j < lst.size() - 1; j++) {
                for (int k = j + 1; k < lst.size(); k++) {
                    maxNum = Math.max(maxNum, (lst.get(i) + lst.get(j) + lst.get(k)) % 10);
                }
            }
        }

        return maxNum;
    }

}
