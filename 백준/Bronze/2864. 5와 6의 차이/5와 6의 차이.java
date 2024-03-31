import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();
        int max, min;

        // min
        min = Integer.parseInt(a.replace('6', '5')) + Integer.parseInt(b.replace('6', '5'));
        // max
        max = Integer.parseInt(a.replace('5', '6')) + Integer.parseInt(b.replace('5', '6'));

        System.out.println(min+ " " +max);
        br.close();
    }
}
