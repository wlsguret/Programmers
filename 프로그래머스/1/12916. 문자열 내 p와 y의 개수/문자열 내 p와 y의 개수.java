class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int cnt = 0;
        for(char c : s.toCharArray()) {
            if(c == 'Y' || c == 'y') cnt++;
            else if(c == 'P' || c == 'p') cnt--;
        }    

        return cnt == 0 ? answer : !answer;
    }
}