import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Set<String> reports = new HashSet<>(Arrays.asList(report));
        
        // 신고당한자 , 신고자리스트
        Map<String, List<String>> map = new HashMap<>();
        
        for (String tmp : reports) {
            String[] log = tmp.split(" ");
            String user = log[0];
            String target = log[1];
            
            List<String> list = map.getOrDefault(target, new ArrayList<>());
            list.add(user);
            map.put(target, list);
        }
        
        Map<String, Integer> mailCnt = new HashMap<>();
        for (String id : id_list) {
            List<String> list = map.get(id);
            if (list == null) continue;
            // 정지 대상자
            if (list.size() >= k) {
                for (String user : list) {
                    mailCnt.put(user, mailCnt.getOrDefault(user, 0) + 1);
                }
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCnt.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}