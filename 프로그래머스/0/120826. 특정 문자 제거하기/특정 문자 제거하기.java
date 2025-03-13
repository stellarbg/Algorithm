class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        char[] arr = my_string.toCharArray();

        for (char c : arr) {
            if (c != letter.charAt(0)) {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}