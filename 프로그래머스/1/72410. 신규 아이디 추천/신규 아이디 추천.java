class Solution {
    public static String solution(String new_id) {
        new_id = new_id.toLowerCase(); //1단계
        new_id = new_id.replaceAll("[^a-z0-9-_.]", ""); //2단계
        new_id = new_id.replaceAll("[.]{2,}", "."); //3단계
        new_id = new_id.replaceAll("^[.]|[.]$", ""); //4단계
        if (new_id.isEmpty()) //5단계
            new_id = "a";
        if (new_id.length() >= 16) //6단계
            new_id = new_id.substring(0, 15).replaceAll("[.]$", "");
        while (new_id.length() < 3) //7단계
            new_id += new_id.charAt(new_id.length() - 1);

        return new_id;
    }
}