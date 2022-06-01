import java.util.ArrayList;
import java.util.Scanner;
class Operation {
    private int x, y;
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y=y;
    }

    public void add(int x, int y) {
        System.out.println(x+y);
    }
    public void sub(int x, int y) {
        System.out.println(x-y);
    }
    public void mul(int x, int y) {
        System.out.println(x*y);
    }
    public void div(int x, int y) {
        System.out.println(x/y);
    }
    public void rmd(int x, int y) {
        System.out.print(x%y);
    }
}
public class J_10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] b = a.split(" ");
        int x = Integer.parseInt(b[0]);
        int y = Integer.parseInt(b[1]);
        Operation opr = new Operation();
        opr.setX(x); opr.setY(y);
        opr.add(x, y);
        opr.sub(x, y);
        opr.mul(x, y);
        opr.div(x, y);
        opr.rmd(x, y);
    }
}
