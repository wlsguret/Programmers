class Solution {
    public String solution(String code) {
        String answer = "";
        int idx = 0;
        int mode = 0;
        for(char c : code.toCharArray()) {
            if(mode == 0) {
                if(c != '1') {
                    if(idx % 2 == 0) {
                        answer += c;
                    }    
                } else {
                    mode = 1;
                }
            } else {
                if(c != '1') {
                    if(idx % 2 == 1) {
                        answer += c;
                    }    
                } else {
                    mode = 0;
                }
            }
            idx++;
        }
        
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}