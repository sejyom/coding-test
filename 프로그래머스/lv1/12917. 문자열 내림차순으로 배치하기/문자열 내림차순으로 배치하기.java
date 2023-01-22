import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        String answer="";
        Arrays.sort(str, Comparator.reverseOrder());
        for (int i=0; i<str.length; i++)
            answer+=str[i];
    
        return answer;
    }
}