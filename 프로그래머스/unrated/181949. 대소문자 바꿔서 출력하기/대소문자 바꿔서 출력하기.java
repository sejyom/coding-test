import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                sb.append(String.valueOf(str.charAt(i)).toLowerCase());
            else
                sb.append(String.valueOf(str.charAt(i)).toUpperCase());
        }
        System.out.println(sb);
    }
}