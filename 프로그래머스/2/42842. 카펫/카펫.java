class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = null;
        brown = brown / 2 - 2;
        int x;
        for(int y = 1; y < brown; y++) {
            x = brown - y;
            if(x * y == yellow) {
                x += 2;
                y += 2;
                if(x >= y) {
                    answer = new int[] {x, y};
                } else {
                    answer = new int[] {y, x};
                }
            }
        }
        
        return answer;
    }
}