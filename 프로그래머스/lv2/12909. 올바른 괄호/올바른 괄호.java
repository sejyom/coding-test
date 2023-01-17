import java.util.Stack;

class Solution {
    public boolean solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        boolean answer = true;


        if(s.charAt(0)!=')' && s.charAt(s.length()-1)!='(') {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(')
                    stack.push(s.charAt(i));
                else if (!(stack.isEmpty()))
                    stack.pop();
                else {
                    answer = false;
                    break;
                }

            }
        } else
            answer = false;

        if (stack.size()!=0)
            answer = false;
        
        return answer;
        
    }
}