class Solution {
    public int solution(int n) {
        int piece = 7;
        return n % piece == 0 ? n / piece : n / piece + 1;
    } 
}