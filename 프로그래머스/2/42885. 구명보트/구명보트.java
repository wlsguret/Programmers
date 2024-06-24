import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int min = 0;
        int max = people.length - 1;
        
        for(int i = max; i >= 0; i--) {
            if(i == min) {
                answer++;
                break;
            } else if(i < min) {
                break;
            }
            if(people[i] + people[min] <= limit) {
                answer++;
                min++;
            } else {
                answer++;
            }
        }
       
        return answer;
    }
}