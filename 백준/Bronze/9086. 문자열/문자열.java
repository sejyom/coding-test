import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> lst;
        String res;

        for (int i = 0; i < n; i++) {
            lst = Arrays.asList(br.readLine().split(""));
            res = lst.get(0) + lst.get(lst.size() - 1);
            System.out.println(res);
        }
    }
}