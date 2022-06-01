import java.util.Scanner;
import java.util.ArrayList;
public class J_2605 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> res = new ArrayList<Integer>();
        int stu = s.nextInt(); // 학생수 입력
        s.nextLine();
        // nextLine()전에 nextXXX() 사용 시 s.nextLine(); 로 버퍼 비워주기
        String str = s.nextLine(); // 학생들이 뽑은 번호
        String[] n = str.split(" ");
        int [] m = new int[stu];

        for (int i=0; i<stu; i++) {
            m[i] = Integer.parseInt(n[i]);
            res.add(i-m[i], i+1);
        }
        for (int i : res)
            System.out.print(i + " ");
    }
}
