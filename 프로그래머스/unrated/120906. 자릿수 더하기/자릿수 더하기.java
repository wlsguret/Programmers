class Solution {
    public int solution(int n) {
        int answer = 0;
        int quotient = 10;
        int remainder;
        
        while(n > quotient) {
            remainder = n % quotient;
            n -= remainder;
            n /= quotient;
            answer += remainder;

        }
        // 마지막 자릿수 실행
        remainder = n % quotient;
        n -= remainder;
        n /= quotient;
        answer += remainder;
        
        return answer;
    }
}