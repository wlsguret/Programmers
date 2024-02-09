class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int tmp;
        for(String num : strArr) {
            tmp = Integer.parseInt(num);
            if(max < tmp) max = tmp;
            if(tmp < min) min = tmp;
        }
        return min + " " + max;
    }
}