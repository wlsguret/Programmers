class Solution {
    public int solution(int price) {
        int answer;
        if (price <100000) {
            answer = price;
        } else if (price < 300000) {
            answer = price * 95 / 100;
        } else if (price < 500000) {
            answer = price * 90 / 100;
        } else {
            answer = price * 80 / 100;
        }
        return answer;
    }
}