class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            answer += arr[arr.length - 1 - i];
        }

        return answer;
    }
}