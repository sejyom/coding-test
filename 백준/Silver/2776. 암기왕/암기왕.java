import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb;
        Set<Integer> note = new HashSet<>();
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            sb = new StringBuffer();
            note.clear();
            br.readLine();
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens())
                note.add(Integer.parseInt(st.nextToken()));
            br.readLine();

            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int n = Integer.parseInt(st.nextToken());
                sb.append(note.contains(n) ? 1 : 0);
                sb.append("\n");
            }
            System.out.print(sb.toString());
        }
    }
}
