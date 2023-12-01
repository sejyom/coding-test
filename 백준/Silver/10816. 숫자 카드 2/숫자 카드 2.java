import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tmp = 0;
        String n = br.readLine();
        Map<String, Integer> cards = new HashMap<>();
        String[] arr = br.readLine().split(" ");
        String m = br.readLine();
        List<String> targets = Arrays.asList(br.readLine().split(" "));

        for (String s : arr)
            cards.put(s, cards.getOrDefault(s, 0) + 1);

        System.out.println(findTargets(cards, targets));
    }

    public static String findTargets(Map<String, Integer> cards, List<String> targets) {
        StringBuffer sb = new StringBuffer();

        for (String target : targets) {
            if (cards.keySet().contains(target))
                sb.append(cards.get(target) + " ");
            else
                sb.append("0 ");
        }

        return sb.toString();
    }

}