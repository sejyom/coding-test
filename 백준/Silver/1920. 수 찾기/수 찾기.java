import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int BSearch(int[] arr, int num) {
        int first=0, last=arr.length-1, mid;

        while(first<=last) {
            mid = (first+last)/2;
            if (num < arr[mid])
                last = mid-1;
            else if (num > arr[mid])
                first = mid+1;
            else if (num == arr[mid])
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
//            while(st.hasMoreTokens())
            st = new StringTokenizer(br.readLine(), " ");
            for(int i=0; i<n; i++)
                a[i] = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(br.readLine());
            int[] b = new int[m];
            st = new StringTokenizer(br.readLine(), " ");
            for (int i=0; i<m; i++)
                b[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(a);

            for (int i : b)
                System.out.println(BSearch(a, i));

        }

}
