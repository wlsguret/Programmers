class Solution {
    public int solution(int n) {
        //int cnt = count(n);
        int cnt = Integer.bitCount(n);
        
        while (n++ <= 1_000_000) {
            //if(cnt == count(n)) break;
            if(cnt == Integer.bitCount(n)) break;
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