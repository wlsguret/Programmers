import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int tmp = 0;
        for(int a : A) {
            for(int i = tmp; i < B.length; i++) {
                int b = B[i];
                if(a > b) tmp = i;
                else if(a < b) {
                    tmp = ++i;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}