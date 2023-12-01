import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        if (a.length() > b.length())
            b = formatting(b, a.length() - b.length());
        else if (b.length() > a.length())
            a = formatting(a, b.length() - a.length());

        System.out.println(calculate(a, b));
    }

    public static String calculate(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int tmp;
        int ten = 0;
        List<String> lstA = Arrays.asList(a.split(""));
        List<String> lstB = Arrays.asList(b.split(""));

        for (int i = lstA.size() - 1; i >= 0; i--) {

            tmp = (Integer.parseInt(lstA.get(i)) + Integer.parseInt(lstB.get(i)) + ten);
            ten = 0;
            if (tmp >= 10) {
                sb.append(tmp % 10);
                ten = 1;
            } else
                sb.append(tmp);
        }

        if (ten == 1)
            sb.append(ten);

        return sb.reverse().toString();
    }

    public static String formatting(String str, int diff) {
        return "0".repeat(diff) + str;
    }
}
