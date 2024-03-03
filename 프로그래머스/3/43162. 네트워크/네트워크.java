import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        // 네트워크 키 초기화
        // 각자 index 를 네트워크 ID로 가지고 있음
        int[] networks = new int[n];
        for(int i = 0; i < n; i++) {
            networks[i] = i;
        }    
        
        for(int i = 0; i < n; i++) {
            int[] networkInfo = computers[i];
            int ip = networks[i];
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                
                int isConnected = networkInfo[j];
                if(isConnected == 1) {
                    int oldIp = networks[j];
                    networks[j] = ip;
                    // 연결된 네트워크 전부 동기화
                    for(int x = 0; x < n; x++) {
                        if(networks[x] == oldIp) {
                            networks[x] = ip;
                        }
                    }
                }
            }
        }
        
        Set set = new HashSet();
        for(int i : networks) {
            set.add(i);
        }  

        return set.size();
    }
}