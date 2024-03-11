import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int[] line : lines) {
            for(int start = line[0]; start < line[1]; start++) {
                map.put(start, map.getOrDefault(start,0) + 1);
            }
        }

        return (int) map.values().stream().filter(i -> i > 1).count();
    }
}