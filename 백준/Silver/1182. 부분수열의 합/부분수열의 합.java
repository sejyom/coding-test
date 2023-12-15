import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int s = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = subseq(arr, s, 0, 0);
        System.out.println(s == 0 ? result - 1 : result);

    }

    public static int subseq(int[] arr, int s, int index, int sum) {
        int include, exclude;

        if (index == arr.length)
            return sum == s ? 1 : 0;
        
        include = subseq(arr, s, index + 1, sum + arr[index]);
        exclude = subseq(arr, s, index + 1, sum);

        return include + exclude;
    }
}