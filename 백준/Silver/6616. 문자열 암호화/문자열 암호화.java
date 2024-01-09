import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        List<String> lst;

        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;
            lst = Arrays.stream(br.readLine().replace(" ", "").split("")).collect(Collectors.toList());
            System.out.println(encryption(n, lst, lst.size()));
        }
    }

    public static String encryption(int n, List<String> lst, int size) {
        String[] res = new String[lst.size()];
        int lcv = 0, ptr = 0;

        while (!lst.isEmpty()) {
            res[ptr] = lst.get(0).toUpperCase();
            lst.remove(0);

            if (ptr + n >= size)
                ptr = ++lcv;
            else
                ptr += n;
        }

        return String.join("", res);
    }
}
