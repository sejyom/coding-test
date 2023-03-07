import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double result = 0;
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        double[] nums = Arrays.stream(str).mapToDouble(Double::parseDouble).toArray();
        double m = 0;

        for (double i : nums)
            m = Math.max(m, i);

        for (double i : nums)
            result += i / m * 100;

        System.out.println(result/nums.length);

        br.close();
    }
}
