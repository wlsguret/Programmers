class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char tmp = 32;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(tmp == 32) {
                if(c >= 97 && c < 123) c -= 32;
            } else {
                if(c >= 65 && c < 91) c += 32;
            }
            tmp = c;
            answer.append(c);
        }
        return answer.toString();
    }
}