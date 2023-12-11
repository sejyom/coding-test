import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> lst;
        int maxNum = 0;
        int temp = 0;
        int result = 0;

        for (int n = 1; n <= N; n++) {
            lst = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            temp = findMaxNum(lst);
            if (maxNum <= temp) {
                maxNum = temp;
                result = n;
            }

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
