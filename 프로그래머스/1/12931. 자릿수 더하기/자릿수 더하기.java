import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String number = n + "";
        
        for(String num : number.split("")) {
            answer += Integer.parseInt(num);
        }

        return answer;
    }
}