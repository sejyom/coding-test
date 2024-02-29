import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++)
            result += groupWordChecker(br.readLine().toCharArray());

        System.out.println(result);
    }

    public static int groupWordChecker(char[] arr) {
        boolean[] checked = new boolean['z' + 1];

        if (arr.length == 1)
            return 1;

        checked[arr[0]] = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                checked[arr[i]] = true;
            else {
                if (checked[arr[i]])
                    return 0;
                else
                    checked[arr[i]] = true;
            }
        }

        return 1;
    }
}
