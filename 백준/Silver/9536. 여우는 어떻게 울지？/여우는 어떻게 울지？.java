import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> recording = new ArrayList<>();
        List<String> noises = new ArrayList<>();
        String str;


        for (int i = 0; i < n; i++) {
            recording.clear();
            noises.clear();

            recording = Arrays.stream(br.readLine().split(" ")).collect(Collectors.toList());
            while (true) {
                str = br.readLine();
                if (str.equals("what does the fox say?"))
                    break;
                noises.add(str.substring(str.lastIndexOf(" ") + 1));
            }

            System.out.println(foxBark(recording, noises));
        }
    }

    public static String foxBark(List<String> recording, List<String> noises) {

        for (String animal : noises) {
            if (recording.contains(animal))
                while (recording.remove(animal)) {}
        }

        return String.join(" ", recording);
    }
}
