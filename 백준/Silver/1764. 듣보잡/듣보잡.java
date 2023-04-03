import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        String str;
        List<String> lst = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n + m; i++) {
            str = String.valueOf(br.readLine());
            if (!map.containsKey(str))
                map.put(str, 1);
            else map.put(str, 2);
        }

        for (String s : map.keySet())
            if (map.get(s) == 2)
                lst.add(s);

        Collections.sort(lst);

        System.out.println(lst.size());
        for (String s : lst)
            System.out.println(s);
    }
}
