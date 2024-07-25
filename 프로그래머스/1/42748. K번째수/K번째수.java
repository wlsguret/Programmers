import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0;
        for (int[] command : commands) {
            int from = command[0] -1;
            int to = command[1];
            int idx = command[2] -1;  
            int[] arr = Arrays.copyOfRange(array, from, to);
            Arrays.sort(arr);
            answer[i++] = arr[idx];
        }    
        return answer;
    }
}