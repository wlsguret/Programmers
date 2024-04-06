class Solution {
    public int solution(int num) {
        if(num == 1) return 0;
        long number = num;
        
        for(int i = 0; i < 500; i++) {
            if(number % 2 == 0) {
                number /= 2;
            } else {
                number = (number * 3) + 1;
            }
            if(number == 1) {
                return ++i;
            }
        }
        
        return -1;
    }
}