import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        String keyX = "x";
        String keyY = "y";

        Map<Map<String, Integer>, String> map = new LinkedHashMap<>(); // 지도
        Map<String, Integer> location = new HashMap<>(); // 시작위치
 
        // 지도를 그리며 시작위치 찾기
        int tmpX = 0;
        int tmpY = 0;
        for (String road : park) {
            tmpX = 0;
            for (String type : road.split("")) {
                Map<String, Integer> point = new HashMap<>();
                point.put(keyX, tmpX++);
                point.put(keyY, tmpY);
                map.put(point, type);
                if (type.equals("S")) location = point;
            }
            tmpY++;
        }

        // 지도의 경계선
        Map<String, Integer> boundary = Map.of(keyX, tmpX - 1, keyY, tmpY - 1);

        routes:
        for (String route : routes) {
            String[] temp = route.split(" ");
            String way = temp[0];
            int num = Integer.parseInt(temp[1]);

            int x = location.get(keyX);
            int y = location.get(keyY);

            Map<String, Integer> move = new HashMap<>();
            for (int i = 0; i < num; i++) {
                // 경계선을 넘지 않을 경우 이동
                switch (way) {
                    case "N":
                        if (location.get(keyY) - num < 0) continue routes;
                        move.put(keyX, x);
                        move.put(keyY, --y);
                        break;
                    case "S":
                        if (location.get(keyY) + num > boundary.get(keyY)) continue routes;
                        move.put(keyX, x);
                        move.put(keyY, ++y);
                        break;
                    case "W":
                        if (location.get(keyX) - num < 0) continue routes;
                        move.put(keyX, --x);
                        move.put(keyY, y);
                        break;
                    case "E":
                        if (location.get(keyX) + num > boundary.get(keyX)) continue routes;
                        move.put(keyX, ++x);
                        move.put(keyY, y);
                        break;
                }
                // 이동중 장애물을 만나는 경우
                if ("X".equals(map.get(move))) continue routes;
            }
            location.put(keyX, x);
            location.put(keyY, y);

        }

        return new int[]{location.get(keyY), location.get(keyX)};
    }
}