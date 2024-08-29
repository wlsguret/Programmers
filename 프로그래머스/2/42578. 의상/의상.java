import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
 
class Solution {
    public int solution(String[][] clothes) {
        Map<String, List<String>> map = new HashMap();
        
        for(String[] wear : clothes) {
            List list = map.getOrDefault(wear[1], new ArrayList());
            list.add(wear[0]);
            map.put(wear[1], list);
        }
        
        int answer = 1;
        // 옷의 종류 별로 조합 +1은 착용하지 않은 경우
        for(List list : map.values()) {
            answer *= list.size() + 1;
        }
        
        return answer -1; // 옷을 입지 않는 경우 제외
    }
}