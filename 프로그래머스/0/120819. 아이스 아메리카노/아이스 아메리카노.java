class Solution {
    public int[] solution(int money) {
        final int price = 5500;
        int cnt = money / price;
        money = money % price;
        int[] answer = {cnt, money};
        return answer;
    }
}