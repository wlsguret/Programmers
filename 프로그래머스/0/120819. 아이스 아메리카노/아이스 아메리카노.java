class Solution {
    public int[] solution(int money) {
        final int price = 5500;
        return new int[] {money / price, money % price}; 
    }
}