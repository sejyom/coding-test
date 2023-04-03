import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int cnt=0, f;
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i=0; i<n; i++)
            lst.add(scanner.nextInt());
        Collections.sort(lst, Collections.reverseOrder()); // descending sort

        while (k!=0) {
            f=findKey(n, k, lst);
            cnt+=k/lst.get(f);
            k%=lst.get(f);
        }
        System.out.println(cnt);
    }
    public static int findKey(int n, int k, ArrayList<Integer> lst) {
        for (int i=1; i<n; i++) {
            if (k>= lst.get(0)) {
                return --i;
            }
            if (k<lst.get(i-1) && k>=lst.get(i))
                return i;
        }
        return n-1;
    }
}
