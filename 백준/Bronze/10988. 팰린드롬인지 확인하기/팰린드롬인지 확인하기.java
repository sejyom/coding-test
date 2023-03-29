import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        sb.append(str).reverse();

        if (str.equals(sb.toString()))
            System.out.println(1);
        else
            System.out.println(0);
    }
}