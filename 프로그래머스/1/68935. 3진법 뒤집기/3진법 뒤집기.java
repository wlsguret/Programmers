class Solution {
    public int solution(int n) {
        String three = Integer.toString(n, 3);
        String reverse = new StringBuilder(three).reverse().toString();
        return Integer.parseInt(reverse, 3);
    }
}