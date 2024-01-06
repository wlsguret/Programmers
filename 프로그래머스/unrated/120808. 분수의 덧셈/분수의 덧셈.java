class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        int gcd = greatestCommonDivisor(numer, denom);
        
        int[] answer = {numer/gcd, denom/gcd};
        return answer;
    }
    
    public int greatestCommonDivisor(int a, int b) {
        if (a % b == 0) return b;
        return greatestCommonDivisor(b, a % b);
    }
}