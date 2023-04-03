import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] msg; int num;
        int loop = Integer.parseInt(br.readLine());
        for (int i=0; i<loop; i++) {
            msg = br.readLine().split(" ");
            switch (msg[0]) {
                case "push":
                    num=Integer.parseInt(msg[1]);
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
                case "front":
                    System.out.println(front());
                    break;
                case "back":
                    System.out.println(back());
                    break;
            }
        }
        br.close();
    }
    public static void push(int x) {
        list.add(x);
    }
    public static int pop() {
        if (list.isEmpty())
            return -1;
        else
            return list.remove(0);
    }
    public static int size() {
        return list.size();
    }
    public static int empty() {
        if (list.size()!=0)
            return 0;
        else
            return 1;
    }
    public static int front() {
        if (list.size()!=0)
            return list.get(0);
        else
            return -1;
    }
    public static int back() {
        if (list.size()!=0)
            return list.get(list.size()-1);
        else
            return -1;
    }
}