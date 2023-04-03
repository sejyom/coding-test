import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String msg; int num;

        int i=0;
        while(i<loop) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            msg = st.nextToken();

            switch (msg) {
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    push(num);
                    break;
                case "pop":
                    System.out.println(pop());

                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "top":
                    System.out.println(top());
                    break;
            }
            i++;
        }
        br.close();
    }
    public static void push(int x) {
        list.add(x);
    }
    public static Integer pop() {
        if (list.size() != 0)
            return list.remove(list.size()-1);
        else
            return -1;
    }
    public static Integer size() {
        return list.size();
    }
    public static Integer empty() {
        if (list.size() == 0)
            return 1;
        else
            return 0;
    }
    public static Integer top() {
        if (list.size() != 0)
            return list.get(list.size() - 1);
        else
            return -1;
    }
}
