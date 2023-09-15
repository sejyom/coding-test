class Solution {
    public String solution(String str) {
        String[] arr = str.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i=0; i<arr.length; i++) {
            try {
                sb.append(String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1).toLowerCase());
            } catch (Exception e) {
                sb.append(arr[i].toLowerCase());
            } finally {
                if (i != arr.length - 1 || str.endsWith(" "))
                    sb.append(" ");
            }
        }

        return sb.toString();
    }
}