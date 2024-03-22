class Solution {
    public int[] solution(long n) {
        String number = String.valueOf(n);
        int[] answer = new int[number.length()];
        
        int j = 0;
        for(int i = number.length() -1; i >= 0; i--) {
            answer[j++] = Integer.parseInt(String.valueOf(number.charAt(i)));
            
        }
        
        return answer;
    }
}