class Solution {
    public String solution(String my_string, int[] indices) {
        // 성능 최적화
        char[] arr = my_string.toCharArray();
        for(int i : indices) {
            arr[i] = '\0';
        }
        StringBuilder sb = new StringBuilder();
        for(char c : arr) {
            if(c != '\0') sb.append(c);
        }
        
        return sb.toString();
    }
}