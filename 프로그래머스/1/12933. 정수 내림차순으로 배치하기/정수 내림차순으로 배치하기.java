import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        String s = "";
        for(int i = arr.length -1; i >= 0; i--) {
            s += arr[i];
        }

        return Long.valueOf(s);
    }
}