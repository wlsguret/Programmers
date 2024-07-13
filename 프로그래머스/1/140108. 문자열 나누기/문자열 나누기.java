class Solution {
    public int solution(String s) {
        int answer = 0;
        int xCnt = 0;
        int etcCnt = 0;
        char x = s.charAt(0);
        for(char c : s.toCharArray()) {
            if(xCnt == 0 && etcCnt == 0) x = c;
            
            if(c == x) xCnt++; 
            else etcCnt++;
            
            if(xCnt == etcCnt) {
                xCnt = etcCnt = 0;
                answer++;                
            }
        }
        if(xCnt != 0) answer++;
        return answer;
    }
}