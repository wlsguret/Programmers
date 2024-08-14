class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char c : myString.toCharArray()) {
            if(c < 90) {
                c += 32;
            }
            answer += c;
        }
        return answer;
    }
}