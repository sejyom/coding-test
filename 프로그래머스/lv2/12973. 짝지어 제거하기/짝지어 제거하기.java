import java.util.Stack;

class Solution
{
    public int solution(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<str.length(); i++) {
            if (!stack.isEmpty() && stack.peek()==(str.charAt(i)))
                stack.pop();
            else stack.push(str.charAt(i));
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}