class Solution {
    public int solution(int[] num_list) {
        StringBuffer even = new StringBuffer();
        StringBuffer odd = new StringBuffer();

        for (int i : num_list) {
            if (i % 2 == 0)
                even.append(String.valueOf(i));
            else
                odd.append(String.valueOf(i));
        }

        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }
}