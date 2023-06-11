class Solution {
    public int solution(int a, int b) {
        int x = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int y = 2 * a * b;

        return x > y ? x : y;
    }
}