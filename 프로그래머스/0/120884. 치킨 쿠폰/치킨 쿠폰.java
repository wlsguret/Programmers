class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int service = 0;
        do {
            chicken += service;
            service = chicken / 10;
            chicken = chicken % 10;
            answer += service;
        } while(service + chicken >= 10);
        
        return answer;
    }
    
   
}