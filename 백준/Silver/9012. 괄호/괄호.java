import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] brk = new String[num];
        String[] isVps = new String[num];
        Stack<String> stk = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < num; i++)
            brk[i] = br.readLine();

        for (int i = 0; i < brk.length; i++) {
            for (int j=0; j<brk[i].length(); j++) {
                if (brk[i].charAt(j)=='(')
                    stk.push("(");
                else {
                    if (stk.isEmpty()) {
                        flag = false;
                        break;
                    }
                    else
                        stk.pop();
                }
            }

            if (stk.size()!=0 || !flag)
                isVps[i] = "NO";
            else isVps[i] = "YES";
            stk.clear();
            flag = true;
        }

        for (String str : isVps)
            System.out.println(str);

        br.close();
    }
}
