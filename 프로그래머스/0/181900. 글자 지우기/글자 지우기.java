class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        int idx = -1;
        name : for(char c : my_string.toCharArray()) {
            idx++;
            for(int index : indices) {
                if(index == idx) {   
                    continue name;
                }
            }
            answer.append(c);
        }
        return answer.toString();
    }
}