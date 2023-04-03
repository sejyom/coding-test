
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i=0; i<n; i++) {
            int num = scanner.nextInt();
            if (num == 0)
                list.remove(list.size()-1);
            else {
                list.add(num);

            }
        }
        for (int i:list) {
            sum+=i;
        }
        System.out.println(sum);


    }
}

