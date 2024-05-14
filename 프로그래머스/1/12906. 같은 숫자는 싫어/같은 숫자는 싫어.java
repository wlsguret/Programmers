public class Solution {
    public int[] solution(int []arr) {
        int cnt = 0;
        int tmp = -1;
        for(int i = 0; i < arr.length; i++) {
            if (tmp == arr[i]) {
                arr[i] = -1;
                cnt++;
            } else {
                tmp = arr[i];
            }
        }
        
        int[] answer = new int[arr.length - cnt];
        
        int j = 0;
        for(int num : arr) { 
            if(num != -1) {
                answer[j++] = num;
            }
        }

        return answer;
    }
}