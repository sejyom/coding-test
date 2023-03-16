import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "long ";
        int n = Integer.parseInt(br.readLine());

        System.out.println(str.repeat((n / 4)) + "int");
        br.close();
    }
}
