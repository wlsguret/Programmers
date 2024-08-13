class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        for(int num : num_list) {
            int max = answer[4];
            if(max != 0 && num > max) continue;
            for(int i = 0; i < answer.length; i++) {
                int tmp = answer[i];
                if(tmp == 0) {
                    answer[i] = num;
                    break;
                } else if(tmp > num) {
                    for(int j = answer.length -1; j >= i && j > 0; j--) {
                        answer[j] = answer[j - 1];
                    }
                    answer[i] = num;
                    break;
                }
            }
        }
        return answer;
    }
}