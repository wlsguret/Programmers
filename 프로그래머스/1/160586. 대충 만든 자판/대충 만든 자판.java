class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] keyNum = new int[26]; // 각 알파벳별 카운팅할 배열
        
        // 키맵 계산
        for(String keyString : keymap) {
            int count = 0;
            for(char k : keyString.toCharArray()) {
                int idx = k - 65; // 아스키코드 A의 65를 빼면 A:0 ~ Z:25 k의 인덱스 획득
                if(keyNum[idx] > count++ || keyNum[idx] == 0) {
                    keyNum[idx] = count; // 해당 키의 주소에 값을 넣음    
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++) {
            int hit = 0;
            for(char j: targets[i].toCharArray()) {
                int no = keyNum[j - 65];
                hit = no == 0 ? -1 : hit + no;
                if (hit == -1) break;
            }
            answer[i] = hit;
        }
  
        return answer;
    }
}