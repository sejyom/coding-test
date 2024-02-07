import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        findAlphabet(br.readLine());
    }

    public static void findAlphabet(String s) {
        for (char c = 'a'; c <= 'z'; c++)
            System.out.print(s.indexOf(c) + " ");
    }
}