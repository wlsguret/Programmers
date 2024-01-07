class Solution {
    public int[] solution(int n) {
        /*
        answer array size 
        홀수 : 나누기 2 + 1(본인)
        짝수 : 나누기 2 
        */
        int size = n % 2 == 1 ? n/2 + 1 : n/2;
        
        int[] answer = new int[size];
        int idx = 0;
        for(int i = 1; i <= n; i = i + 2) {
            answer[idx++] = i;
        }
        
        return answer;
    }
}