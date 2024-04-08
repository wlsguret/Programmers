class Solution {
    public int solution(int n) {
        int max = n > 1000 ? 1000 : n;
        for(int i = 0; i <= max; i++) {
            if(i * i == n) return 1;
        }
        return 2; 
    }
}