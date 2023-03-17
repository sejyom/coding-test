import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<String> lst = new ArrayList<>();
        lst.add("c=");
        lst.add("c-");
        lst.add("dz=");
        lst.add("d-");
        lst.add("lj");
        lst.add("nj");
        lst.add("s=");
        lst.add("z=");
        for (int i = 0; i < lst.size(); i++)
            if (str.contains(lst.get(i)))
                str = str.replaceAll(lst.get(i), "*");
        System.out.println(str.length());
    }
}
