import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = GCD(a, b);
        System.out.println(gcd + "\n" + (a*b/gcd));
        br.close();
    }
    public static int GCD(int a, int b) {
        int c;
        while (a!=0) {
            c=b%a;
            b=a;
            a=c;
        }
        return b;
    }
}
