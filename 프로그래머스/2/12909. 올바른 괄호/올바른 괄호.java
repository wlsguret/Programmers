class Solution {
    boolean solution(String s) {
        // 길이가 홀수 일때 실패
        if(s.length() % 2 != 0) return false;
        // 닫힘으로 시작 실패
        else if(s.startsWith(")")) return false;
        // 열림으로 종료 실패
        else if(s.endsWith("(")) return false;

        int cnt = 0;
        for(char c : s.toCharArray()) {
            switch(c) {
                case '(' :
                    cnt++;
                    break;
                case ')' :
                    cnt--;
                    break;
            }
            if(cnt < 0) return false;
        }

        return cnt == 0;
    }

}