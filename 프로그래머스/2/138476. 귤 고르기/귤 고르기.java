import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap();
        for(int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> entries = map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .collect(Collectors.toList());
        Collections.reverse(entries);
        
        int answer = 0;
        int tmp = 0;
        for (Map.Entry<Integer, Integer> entry : entries) {
            tmp += entry.getValue();
            answer++;
            if(tmp >= k) break;
        }
        
        return answer;
    }
}