import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int std = scanner.nextInt();
        scanner.nextLine();
        String [] num = scanner.nextLine().split(" ");

        if (num.length != cnt)
            System.out.println("값 불일치");

        for (int i = 0; i < num.length; i++)
            if (std > Integer.parseInt(num[i]))
                System.out.print(num[i] + " ");

        scanner.close();
    }
}
