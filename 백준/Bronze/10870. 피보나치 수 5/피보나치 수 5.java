import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0, b = 1, temp=0;

        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        
        if (n == 0)
            System.out.println(a);
        else if (n == 1)
            System.out.println(b);
        else 
            System.out.println(temp);
        
        br.close();
    }
}
