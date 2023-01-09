class Solution {
    public static int solution(int n) {
        int answer = 0;
        int lcv = 0;
        StringBuilder sb;
        sb = new StringBuilder(Integer.toString(n, 3)); //3진법 변환
        sb.reverse(); //앞뒤 반전
        for(int i=sb.length()-1; i>=0; i--) { //10진법 변환
            answer += Math.pow(3, lcv++)*(sb.charAt(i)-'0');
        }

        return answer;
    }
}