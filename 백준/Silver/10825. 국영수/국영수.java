import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Student {
        String name;
        int korean;
        int english;
        int math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Student> infos = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        String name;
        int korean, english, math;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            name = st.nextToken();
            korean = Integer.parseInt(st.nextToken());
            english = Integer.parseInt(st.nextToken());
            math = Integer.parseInt(st.nextToken());

            infos.add(new Student(name, korean, english, math));
        }

        sorting(infos);
    }

    public static void sorting(List<Student> infos) {
        Comparator<Student> comparator = Comparator
                .comparing((Student std) -> std.korean, Comparator.reverseOrder())
                .thenComparing(std -> std.english)
                .thenComparing(std -> std.math, Comparator.reverseOrder())
                .thenComparing(std -> std.name);

        Collections.sort(infos, comparator);

        for (Student std : infos)
            System.out.println(std.name);
    }
}
