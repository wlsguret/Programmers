class Solution {
    public long solution(int a, int b) {
        if(a == b) return a;
        
        int tmp = a;
        if(b > a) {
            a = b;
            b = tmp;
        }
        
        long cnt = (long) Math.ceil((a - b) / 2);
        long answer = (a + b) * cnt;
        
        if ((a - b) % 2 == 0) {
            answer += (a + b) / 2;
        }
        return (long) (b+a)*(Math.abs(b-a)+1)/2;
        //return answer;
    }
}