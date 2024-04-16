class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String word : babbling) {
            if(check(word)) answer++;
        }    
        return answer;
    }
    
    boolean check(String word) {
        return word.replace("aya", " ")
            .replace("ye", " ")
            .replace("woo", " ")
            .replace("ma", " ") 
            .isBlank();
    }
}