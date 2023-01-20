class Solution {
    public int solution(int n) {
        int result = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                result++;

        }

        return result;
    }

    public boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i=2; i*i<=n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}