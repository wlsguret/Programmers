class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = n; i > 0; i--) {
            int num = 0;
            for(int j = i; j >= 0; j--) {
                if(num == n)  {
                    answer++;
                    break;
                }
                else if(num > n) break;
                else num += j;
            }
        }
        
        return answer;
    }
}