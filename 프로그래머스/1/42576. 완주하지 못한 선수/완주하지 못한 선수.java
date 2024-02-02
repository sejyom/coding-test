import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] participant, String[] completion) {
        List<String> p = Arrays.asList(participant);
        List<String> c = Arrays.asList(completion);

        for (String person : p)
            if (!c.contains(person))
                return person;

        return "";
    }
}