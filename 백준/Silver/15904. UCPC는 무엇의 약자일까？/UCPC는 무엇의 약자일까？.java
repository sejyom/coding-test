import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<Character> ucpc = new ArrayList<Character>();
        ucpc.add('U');
        ucpc.add('C');
        ucpc.add('P');
        ucpc.add('C');

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ucpc.get(0)) {
                ucpc.remove(0);
                if (ucpc.isEmpty())
                    break;
            }
        }

        if (ucpc.isEmpty())
            System.out.println("I love UCPC");
        else
            System.out.println("I hate UCPC");
    }
}
