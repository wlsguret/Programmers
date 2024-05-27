class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int num : array) {
            while(num > 0) {
                int n = num % 10;
                if(n == 7) answer++;
                num /= 10;
            }
        }
        return answer;
    }
}