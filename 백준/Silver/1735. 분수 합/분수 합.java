import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int demon1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int num2 = Integer.parseInt(st.nextToken());
        int demon2 = Integer.parseInt(st.nextToken());

        calculateFractions(num1, demon1, num2, demon2);
    }


    public static void calculateFractions(int num1, int demon1, int num2, int demon2) {
        int demon = lcm(demon1, demon2);

        num1 *= (demon / demon1);
        num2 *= (demon / demon2);

        int num = num1 + num2;

        int gcd = gcd(num, demon);
        num /= gcd;
        demon /= gcd;

        System.out.println(num + " " + demon);
    }
    
    public static int lcm(int demon1, int demon2) {
        return (demon1 * demon2) / gcd(demon1, demon2);
    }

    public static int gcd(int demon1, int demon2) {
        if (demon1 < demon2) {
            int temp = demon1;
            demon1 = demon2;
            demon2 = temp;
        }
        if (demon2 == 0)
            return demon1;
        else if (demon1 % demon2 == 0)
            return demon2;
        else return gcd(demon2, demon1 % demon2);
    }
}
