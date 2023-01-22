class Solution {
    public String solution(int [] food) {
        StringBuffer sb = new StringBuffer();
        StringBuffer str = new StringBuffer();
        for (int i = 1; i < food.length; i++)
            sb.append(String.valueOf(i).repeat(food[i]/2));

        str.append(sb);
        str.append(sb.reverse());
        str.insert(str.length() / 2, "0");
        return str.toString();
    }
}