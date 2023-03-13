import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer(br.readLine());
        int i = 0;

        while (s.length() / 10 > 0) {
            System.out.println(s.substring(i, i + 10));
            s.delete(i, i + 10);
        }

        if (s.length()>0)
            System.out.println(s.substring(0));

        br.close();
    }
}
