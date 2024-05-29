class Solution {
    public int solution(int n) {
        int cnt = count(n);
        
        while (n++ <= 1_000_000) {
            if(cnt == count(n)) break;
        }
        
        return n;
    }
    
    int count(int number) {
        int tmp = 0;
        for(char num : Integer.toBinaryString(number).toCharArray()) {
            if(num == '1') tmp++;
        }
        return tmp;
    }
}