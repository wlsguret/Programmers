import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        Arrays.sort(arr);
        int idx = 0;
        for(int i : arr) {
            if(i % divisor == 0) {
                answer[idx++] = i;
            }
        }
        if(idx == 0) return new int[] {-1};
        
        return Arrays.copyOf(answer, idx);
    }
}