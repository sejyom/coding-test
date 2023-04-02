import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sugar, cnt=0;
        Scanner scanner = new Scanner(System.in);
        sugar = scanner.nextInt();
        if (sugar%5==0)
            System.out.println(sugar/5);
        else {
            while (true) {
                sugar-=3;
                cnt++;
                if (sugar%5==0) {
                    cnt+=sugar/5;
                    System.out.println(cnt);
                    break;
                }
                if (sugar==0)
                    System.out.println(cnt);
                if (sugar<0) {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}