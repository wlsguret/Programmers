class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String num : strArr) {
            int tmp = Integer.parseInt(num);
            if(max < tmp) max = tmp;
            if(tmp < min) min = tmp;
        }
        return min + " " + max;
    }
}