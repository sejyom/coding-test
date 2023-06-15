class Solution {
    public int solution(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++)
            result += Integer.parseInt(String.valueOf(number.charAt(i)));
        return result % 9;
    }
}