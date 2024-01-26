import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(findCount(br.readLine()));
    }

    public static int findCount(String str) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('0', 0);
        map.put('1', 0);
        map.put('2', 0);
        map.put('3', 0);
        map.put('4', 0);
        map.put('5', 0);
        map.put('6', 0);
        map.put('7', 0);
        map.put('8', 0);
        map.put('9', 0);

        for (int i = 0; i < str.length(); i++)
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

        int tmp = map.get('6') + map.get('9');
        if (tmp > 0) {
            if (tmp % 2 == 0) {
                map.replace('6', tmp / 2);
                map.replace('9', tmp / 2);
            }
            else {
                map.replace('6', (int) Math.ceil((double) tmp / 2));
                map.replace('9', (int) Math.ceil((double) tmp / 2));
            }
        }

        return Collections.max(map.values());
    }
}
