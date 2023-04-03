import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s=scanner.nextLong();
        long sum=0; int count=0;
        for (int i=1; i<=s; i++) {
            sum+=i;
            count++;
            if (sum==s)
                break;
            else if (sum+(i+1)>s) {
                count--;
                sum-=i;
            }
        }
        System.out.println(count);
        scanner.close();
    }


}
