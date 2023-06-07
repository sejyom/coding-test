class Solution {
    public int solution(int a, int b) {
        String s1 = String.valueOf(a) + String.valueOf(b);
        String s2 = String.valueOf(b) + String.valueOf(a);

        if (Integer.parseInt(s1) > Integer.parseInt(s2))
            return Integer.parseInt(s1);
        else
            return Integer.parseInt(s2);
    }
}