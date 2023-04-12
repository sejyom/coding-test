import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = numOfCases(Integer.parseInt(br.readLine()));

        for (int i : arr)
            System.out.println(i);
    }

    public static int numOfCases(int num) {

        if (num==3)
            return 4;
        if (num==2)
            return 2;
        if (num==1)
            return 1;

        return numOfCases(num - 1) + numOfCases(num - 2) + numOfCases(num - 3);
    }
}
