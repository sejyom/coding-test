class Solution {
    public int solution(int n) {
        int result = 0;
        if (n==1)
            return 0;
        else {
            for(int i=2; i<=n; i+=2) {
                result+=i;
            }
        }
        return result;
    }
}