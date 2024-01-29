import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(nextLarger(br.readLine())); //156
    }

    public static int nextLarger(String x) {
        List<Integer> comb = new ArrayList<>();
        boolean[] visited = new boolean[x.length()];

        getCombinations(comb, x.toCharArray(), visited, new StringBuffer());
        comb = comb.stream().sorted().collect(Collectors.toList());

        for (int c : comb)
            if (Integer.parseInt(x) < c)
                return c;

        return 0;
    }

    public static void getCombinations(List<Integer> comb, char[] arrX, boolean[] visited, StringBuffer temp) {
        if (temp.length() == arrX.length) {
            comb.add(Integer.parseInt(temp.toString()));
            return ;
        }

        for (int i = 0; i < arrX.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.append(arrX[i]);
                getCombinations(comb, arrX, visited, temp);
                temp.deleteCharAt(temp.length() - 1);
                visited[i] = false;
            }
        }
    }
}
