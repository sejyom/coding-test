import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] res = new String[n];

        for (int i = 0; i < n; i++) {
            res[i] = result(br.readLine());
        }

        for (String str : res)
            System.out.println(str);

        br.close();
    }
    public static String result (String s){
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        String str = st.nextToken();

        for (int i = 0; i < str.length(); i++)
            sb.append(String.valueOf(str.charAt(i)).repeat(n));

        return sb.toString();
    }
}