import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> lst = new ArrayList<>();
        String str = "666";
        int n = 666;
        int lcv = 0;
        while (lst.size() <= 10000) {
            if (String.valueOf(n+lcv).contains("666"))
                lst.add(n + lcv);
            lcv++;
        }
        System.out.println(lst.get(num-1));
    }
}
