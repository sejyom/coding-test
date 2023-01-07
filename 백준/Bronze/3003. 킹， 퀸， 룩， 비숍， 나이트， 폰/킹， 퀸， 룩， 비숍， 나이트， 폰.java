import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        int [] arr = {1, 1, 2, 2, 2, 8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String [] ins = str.split(" ");
        int res;

        for (int i=0; i<arr.length; i++) {
            int n = Integer.parseInt(ins[i]);
            if (n != arr[i])
                res = arr[i]-n;
            else
                res = 0;
            bw.write(res + " ");
        }
        br.close();
        bw.close();

    }
}
