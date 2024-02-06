import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        implDeque(Integer.parseInt(br.readLine()));
    }

    public static void implDeque(int n) throws IOException {
        Deque<String> deque = new ArrayDeque<>();
        String[] arr;

        for (int i = 0; i < n; i++) {
            arr = br.readLine().split(" ");

            switch (arr[0]) {
                case "push_front":
                    deque.addFirst(arr[1]);
                    continue;
                case "push_back":
                    deque.addLast(arr[1]);
                    continue;
                case "pop_front":
                    System.out.println(deque.peekFirst() == null ? -1 : deque.pollFirst());
                    continue;
                case "pop_back":
                    System.out.println(deque.peekLast() == null ? -1 : deque.pollLast());
                    continue;
                case "size":
                    System.out.println(deque.size());
                    continue;
                case "empty":
                    System.out.println(deque.isEmpty() ? 1 : 0);
                    continue;
                case "front":
                    System.out.println(deque.peekFirst() == null ? -1 : deque.peekFirst());
                    continue;
                case "back":
                    System.out.println(deque.peekLast() == null ? -1 : deque.peekLast());
            }
        }
    }
}
