class Solution {
    public boolean solution(int num) {
        int sum=0;
        String[] str = String.valueOf(num).split("");
        for (int i=0; i<str.length; i++)
            sum+=Integer.parseInt(str[i]);
        if (num%sum==0)
            return true;
        else
            return false;
    }
}