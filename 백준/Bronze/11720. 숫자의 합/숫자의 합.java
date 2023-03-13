import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String nums = scanner.nextLine();
        int res = 0;

        for (int i = 0; i < nums.length(); i++)
            res += nums.charAt(i) - '0';

        System.out.println(res);
        scanner.close();
    }
}
