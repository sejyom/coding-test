import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int[] arr = Arrays.stream(nums).sorted().distinct().toArray();
        return arr.length >= nums.length / 2 ? nums.length / 2 : arr.length;
    }
}