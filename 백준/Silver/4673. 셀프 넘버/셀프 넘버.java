public class Main {
    public static void main(String[] args) {
        String[] nums = new String[10001];
        StringBuffer sb = new StringBuffer();
        int res;

        for (int i = 0; i < nums.length; i++) //0~100 값 할당
            nums[i] = String.valueOf(i);

        for (int i = 0; i < nums.length; i++) {
            res = 0;
            res += i;

            for (int j = 0; j < String.valueOf(i).length(); j++)
                res += Integer.parseInt(String.valueOf(String.valueOf(i).charAt(j) - '0'));

            if (res < nums.length)
                nums[res] = ""; //생성자가 있으면 공란으로 변경
        }

        for (String str : nums) {
            if (str.equals(""))
                continue;
            System.out.println(str);
        }
    }

}
