class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int server = 0;
        int[] closed = new int[players.length + k];
        
        for(int i = 0; i < players.length; i++) {
            server -= closed[i];
            
            int need = players[i] / m;
            if(need > server) {
                int add = need - server;
                answer += add;
                server += add;
                closed[i + k] += add;
            }
        }

        return answer;
    }
}