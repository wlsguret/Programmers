import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int number : array) {
            int count = map.getOrDefault(number, 0);
            count++;
            
            if(count > maxCount) {
                maxCount = count;
                answer = number;
                
            } else if(count == maxCount) {
                answer = -1;
            }
            map.put(number, count);
        }
        
        return answer;
    }
}