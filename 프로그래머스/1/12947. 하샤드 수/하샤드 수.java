class Solution {
    public boolean solution(int x) {
        int n = 0;
        for(char num : String.valueOf(x).toCharArray()) {
            n += num - 48;
        }
        
        return x % n == 0;
    }
}