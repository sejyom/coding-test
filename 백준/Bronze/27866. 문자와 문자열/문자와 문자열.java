import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.nextLine();
        int n = scanner.nextInt();

        System.out.println(str.charAt(n-1));

    }
}
