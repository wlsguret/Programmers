import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        
        int cnt = 0;
        int tmp = -1;
        for(int num : arr) {
            if(tmp != num) answer[cnt++] = num;
            tmp = num;
        } 

        return Arrays.copyOf(answer, cnt);
    }
}