import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        char[] chars = my_string.toCharArray();
        for(int i = indices.length -1; i >= 0; i--) {
            chars[indices[i]] = '\0';
        }
        StringBuilder sb = new StringBuilder();
        for(char c : chars) {
            if(c != '\0') sb.append(c);
        }
        
        return sb.toString();
    }
}