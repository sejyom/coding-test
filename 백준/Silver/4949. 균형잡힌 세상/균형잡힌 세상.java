import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("."))
                break;
            else System.out.println(bracket(str));
        }
    }

    public static String bracket(String str) {
        List<Character> arr = new ArrayList<Character>();
        for (char c : str.toCharArray()) {
            if (c=='(' || c=='[')
                arr.add(c);
            else if (c == ']') {
                if (!arr.isEmpty() && arr.get(arr.size()-1) == '[')
                    arr.remove(arr.size() - 1);
                else {
                    arr.add(c); break;
                }
            }
            else if (c==')') {
                if (!arr.isEmpty() && arr.get(arr.size()-1) == '(')
                    arr.remove(arr.size() - 1);
                else {
                    arr.add(c); break;
                }
            }
        }

        if (arr.isEmpty())
            return "yes";
        else return "no";
    }
}
