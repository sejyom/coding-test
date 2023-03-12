import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String mul = String.valueOf(a * b * c);
        int[] res = new int[10];

        for (int i = 0; i < 10; i++)
            res[i] = mul.length() - mul.replace(String.valueOf(i), "").length();

        for (int i : res)
            System.out.println(i);

        br.close();
    }
}
