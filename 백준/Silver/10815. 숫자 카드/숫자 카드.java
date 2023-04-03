import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, start, end, flag=0;
        int[] arrN, arrM;


        n = scanner.nextInt();
        arrN = new int[n]; // 배열 크기 할당
        for (int i=0; i<n; i++) // 상근이가 갖고있는 카드
            arrN[i] = scanner.nextInt();
        Arrays.sort(arrN); // sorting(asc)

        m = scanner.nextInt();
        arrM = new int[m]; // 배열 크기 할당
        for (int i=0; i<m; i++) // 기준이 되는 카드
            arrM[i] = scanner.nextInt();


        for (int i=0; i<arrM.length; i++) {
            flag=0;
            start=0;
            end=arrN.length-1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arrN[mid] == arrM[i]) {
                    flag = 1;
                    break;
                }
                else if (arrN[mid] < arrM[i])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            System.out.print(flag + " ");
        }
        scanner.close();
    }
}
