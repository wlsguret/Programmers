class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String word : babbling) {
            if(word.replaceAll("aya|ye|woo|ma", "").isBlank()) answer++;
        }
        
        return answer;
    }
}