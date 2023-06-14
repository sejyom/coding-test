import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static int[] solution(int[] num_list) {
    List<Integer> result = new ArrayList<>();
        result = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        if (num_list[num_list.length-1]>num_list[num_list.length-2])
            result.add(result.get(result.size()-1)-result.get(result.size()-2));
        else
            result.add(result.get(result.size()-1)*2);
        return result.stream()
                .mapToInt(i -> i)
                .toArray();

    }
}