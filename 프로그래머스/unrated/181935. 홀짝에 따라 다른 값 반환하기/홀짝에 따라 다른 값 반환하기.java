class Solution {
    public int solution(int n) {
        int res = 0;
        if (n%2==0) { //even
            for (int i = 1; i <= n; i++)
                if (i % 2 == 0)
                    res += i * i;
        }
        else { //odd
            for (int i = 1; i <= n; i++)
                if (i % 2 == 1)
                    res += i;
        }
        return res;
    }
}