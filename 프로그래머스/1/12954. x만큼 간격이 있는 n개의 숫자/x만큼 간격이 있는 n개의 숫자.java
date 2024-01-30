class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int idx = 0;
        while(idx < n) {
            answer[idx++] = (long) x * idx;
        }
        return answer;
    }
}