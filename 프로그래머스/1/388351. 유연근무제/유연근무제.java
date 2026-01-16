class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
        
        for(int i = 0; i < timelogs.length; i++) {
            int workSt = schedules[i] + 10; // 출근 인정 시각
            int minute = workSt % 100;
            if(minute >= 60) {
                workSt += 40;
            }

            int initStartday = startday;
            for(int j = 0; j < timelogs[i].length; j++) {
                int day = initStartday++ % 7;
                if(day < 1 || day > 5) {// 주말
                    if(day == 0) initStartday -= 7;
                    continue;
                }
                
                int time = timelogs[i][j]; // 출근 시간
                if(workSt < time) { // 지각
                    answer--;
                    break;
                }
            }
        }
        
        return answer;
    }
}