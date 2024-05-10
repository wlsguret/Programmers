class Solution {
    public int[] solution(String[] wallpaper) {
        int width = wallpaper[0].length();
        int height = wallpaper.length;
        
        int[] answer = {height,width,0,0}; 
        
        int idx = 0;
        for(String row : wallpaper) {
            int index = row.indexOf("#");
            
            
            if(index != -1) {
                if(index < answer[1]) {
                    // 시작 x 좌표
                    answer[1] = index;
                }
            }
             
            int lastIndex = row.lastIndexOf("#");
            if(lastIndex != -1) {
                if(lastIndex >= answer[3]) {
                    // 끝 x 좌표
                    answer[3] = ++lastIndex;
                }
                
                if(idx < answer[0]) {
                    // 시작 y 좌표
                    answer[0] = idx;
                }
                
                // 끝 y 좌표
                answer[2] = idx + 1;
            }
            
            idx++;
        }
        
        return answer;
    }
}