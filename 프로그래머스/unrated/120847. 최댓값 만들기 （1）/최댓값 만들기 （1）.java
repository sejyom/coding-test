import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> lst = IntStream.of(numbers).boxed().collect(Collectors.toList());
        lst = lst.stream().sorted().collect(Collectors.toList());
        return lst.get(lst.size() - 1) * lst.get(lst.size() - 2);
    }
}