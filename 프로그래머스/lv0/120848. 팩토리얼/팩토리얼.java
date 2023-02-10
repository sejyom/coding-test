class Solution {
    public int solution(int n) {
        int result=1;
        int i = 0;
        while (result*i<n) {
            i++;
            result*=i;
        }
        return i;
    }
}