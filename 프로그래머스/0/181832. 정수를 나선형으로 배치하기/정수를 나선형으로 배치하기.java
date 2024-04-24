class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 0;
        int y = 0;
        int direction = 0; // 0 ~ 3 동 남 서 북
        
        int value = 0;
        while(value++ < n*n) {
            answer[y][x] = value;
            
            switch (direction) { 
                case 0 :
                    x++;
                    if(x == n || answer[y][x] != 0) {
                        direction = 1;    
                        x--;
                        y++;
                    }
                    break;
                case 1 :
                    y++;
                    if(y == n || answer[y][x] != 0) {
                        direction = 2;
                        x--;
                        y--;
                    }
                    break;
                case 2 :
                    x--;
                    if(x < 0 || answer[y][x] != 0) {
                        direction = 3;
                        y--;
                        x++;
                    }
                    break;
                case 3 :
                    y--;
                    if(answer[y][x] != 0) {
                        direction = 0;
                        x++;
                        y++;
                    }
                    break;
            }
        }
        
        return answer;
    }
}