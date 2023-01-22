public class Solution {
    public static int solution(int[] numbers) {
        int answer=0, sum=0;
        for (int i=0; i<10; i++)
            answer+=i;
        for (int i=0; i<numbers.length; i++) {
            sum+=numbers[i];
        }
        answer-=sum;
        return answer;
    }
}