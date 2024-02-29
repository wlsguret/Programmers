class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            if(i < s) {
                answer.append(my_string.charAt(i));    
            } else if(i == s) {
                answer.append(overwrite_string);
                i += overwrite_string.length() -1;
            } else {
                answer.append(my_string.charAt(i));    
            }
        }
        return answer.toString();
    }
}