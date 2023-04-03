import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str=str.replace("XXXX","AAAA");
        str=str.replace("XX","BB");
        if (str.indexOf("X")>=0)
            System.out.println(-1);
        else
            System.out.println(str);
    }
}
