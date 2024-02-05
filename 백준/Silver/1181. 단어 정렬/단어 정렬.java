import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> lst = new ArrayList<>();

        for (int i = 0; i < n; i++)
            lst.add(br.readLine());

        sorting(lst);
    }

    public static void sorting(List<String> lst) {
        lst = lst.stream().distinct().collect(Collectors.toList());

        Comparator<String> comparator = Comparator
                .comparing(String::length)
                .thenComparing(Comparator.naturalOrder());

        Collections.sort(lst, comparator);

        lst.stream().forEach(System.out::println);
    }
}
