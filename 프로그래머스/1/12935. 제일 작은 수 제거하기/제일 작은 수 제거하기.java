class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] {-1};
        
        int min = Integer.MAX_VALUE;
        for(int n : arr) {
            if(n < min) min = n;
        }
        
        int[] answer = new int[arr.length - 1];
        int i = 0;
        for(int num : arr) {
            if(num == min) continue;
            else answer[i++] = num;
        }
        
        return answer;
    }
}