class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = n; i > 0; i--) {
            int num = 0;
            for(int j = i; j >= 0; j--) {
                //System.out.println(num+ "  " + j);
                if(num == n)  {
                    answer++;
                    break;
                }
                else if(num > n) break;
                else num += j;
            }
            //System.out.println(i + "회차 "+ answer);
        }
        
        return answer;
    }
}