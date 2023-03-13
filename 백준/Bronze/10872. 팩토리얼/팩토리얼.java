import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = 1;

        for (int i = 2; i <= num; i++)
            res *= i;

        System.out.println(res);
        scanner.close();
    }
}
