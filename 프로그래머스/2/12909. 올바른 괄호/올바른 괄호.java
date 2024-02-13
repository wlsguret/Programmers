class Solution {
    boolean solution(String s) {
        // 길이가 홀수 일때 실패
        if(s.length() % 2 != 0) return false;
        
        // 닫힘으로 시작 실패
        if(s.startsWith(")")) return false;
        // 열림으로 종료 실패
        else if(s.endsWith("(")) return false;
        
        boolean isOpen = false;
        int cnt = 0;
        for(char c : s.toCharArray()) {
            // 닫힌상태에서 닫힘 실패
            if(!isOpen && c == ')') return false;
            
            switch(c) {
                case '(' :
                    cnt++;
                    isOpen = true;
                    break;
                case ')' :
                    cnt--;
                    if(cnt == 0) isOpen = false;
                    break;
            }
        }

        System.out.print("성공");
        // 종료 조건을 만나지 않은경우 성공
        return cnt == 0;
    }
    
}