import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String init = br.readLine();

        System.out.println(solution(init));
        br.close();
    }

    public static int solution(String init) {
        int num = Integer.parseInt(init);
        int cnt = 0, temp;

        if (init.equals("0"))
            return 1;

        while (true) {
            if (Integer.parseInt(init) < 10 && init.charAt(0) != '0')
                init = "0" + init;

            temp = init.charAt(0) - '0' + init.charAt(1) - '0';
            init = String.valueOf(init.charAt(1)) + (temp % 10);
            cnt++;

            if (num == Integer.parseInt(init))
                break;
        }

        return cnt;
    }
}
