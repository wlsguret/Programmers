class Solution {
    public long solution(int a, int b) {
        if(a == b) return a;

        return (long) (b+a) * (Math.abs(b-a)+1) / 2;
    }
}