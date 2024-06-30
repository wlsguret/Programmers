import java.util.*;

class Solution {
    private Map<String, Integer> gemIndexMap = new HashMap<>();
    
    public int[] solution(String[] gems) {
        int[] answer = new int[2];
        
        int start = 0, end = 0;
        
        for(int i = 0; i < gems.length; i++) {
            String gem = gems[i];
            
            if(!gemIndexMap.containsKey(gem)) {
                gemIndexMap.put(gem, i);
                end = i;
                answer = new int[] {start + 1, end + 1};    
            } else {
                gemIndexMap.put(gem, i);
                end = i;
                if(gems[start].equals(gems[i])) {
                    start = getMinIndex();
                    if(answer[1] - answer[0] > end - start) {
                        answer = new int[] {start + 1, end + 1};    
                    }
                }
            }
        }
        
        return answer;
    }
    
    private int getMinIndex() {
        return gemIndexMap.values().stream().mapToInt(x->x).min().getAsInt();
    }
}