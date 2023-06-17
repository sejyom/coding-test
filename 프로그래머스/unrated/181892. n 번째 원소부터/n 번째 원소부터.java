import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> result = new ArrayList<Integer>();
        int lcv = n-1;

        while (true) {
            result.add(num_list[lcv]);
            if (++lcv==num_list.length)
                break;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}