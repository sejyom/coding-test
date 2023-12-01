import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<String, String> map;
        long count;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            
            int m = Integer.parseInt(br.readLine());
            map = new HashMap<>();
            count = 1;

            for (int j = 0; j < m; j++) {

                st = new StringTokenizer(br.readLine());

                String name = st.nextToken();
                String type = st.nextToken();

                map.put(name, type);

            }

            for (String s : map.values().stream().distinct().collect(Collectors.toList()))
                count *= map.values().stream().filter(s::equals).count() + 1;

            System.out.println(count - 1);

        }
    }
}
