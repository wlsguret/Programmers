class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int cnt = 0;
        for(String target : seoul) {
            if("Kim".equals(target)) return "김서방은 " + cnt + "에 있다";
            else cnt++;
        }
        return "김서방은 " + cnt + "에 있다";
    }
}