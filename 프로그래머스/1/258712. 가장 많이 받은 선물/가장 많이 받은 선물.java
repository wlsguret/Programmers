import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        Map<String, Map<String, Integer>> history = new HashMap<>();
        Map<String, Integer> giftPoint = new HashMap<>();

        // 초기화
        for (String name : friends) {
            giftPoint.put(name, 0);

            Map<String, Integer> info = new HashMap<>();
            for (String friend : friends) {
                if (name.equals(friend)) continue;
                info.put(friend, 0);
            }
            history.put(name, info);
        }

        // 데이터 가공
        for (String log : gifts) {
            String[] logInfo = log.split(" ");
            String giver = logInfo[0];
            String taker = logInfo[1];

            // 선물지수 계산
            giftPoint.put(giver, giftPoint.get(giver) + 1);
            giftPoint.put(taker, giftPoint.get(taker) - 1);

            // 본인이 선물 준 대상과 횟수 계산
            Map<String, Integer> myHistory = history.get(giver);
            myHistory.put(taker, myHistory.get(taker) + 1);
            history.put(giver, myHistory);
        }

        
        int cnt; // 받을 선물 수 
        // 계산
        for (String name : friends) {
            cnt = 0;
            Map<String, Integer> info = history.get(name);

            for (String friend : info.keySet()) {
                int give = info.get(friend);
                int take = history.get(friend).get(name);

                // 준 선물이 많은 경우 카운트
                if (give > take) {
                    cnt++;
                } 
                // 주고받은 수가 같은 경우 선물지수 비교 후 카운트
                else if (give == take) {
                    if (giftPoint.get(name) > giftPoint.get(friend)) {
                        cnt++;
                    }
                }
            }
             
            if (cnt > answer) answer = cnt;

        }

        return answer;
    }
}