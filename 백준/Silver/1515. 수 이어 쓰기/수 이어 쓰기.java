import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(findNumber(Arrays.stream(br.readLine().split("")).map(Integer::parseInt).collect(Collectors.toList())));

    }

    public static int findNumber(List<Integer> lst) {
        int num = 0;
        String str;

        while (true) {
            str = String.valueOf(++num);

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) - '0' == lst.get(0))
                    lst.remove(0);
                if (lst.isEmpty())
                    return num;
            }
        }
    }
}