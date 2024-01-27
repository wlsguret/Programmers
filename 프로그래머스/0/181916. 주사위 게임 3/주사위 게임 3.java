import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        
        int no = map.size();
        System.out.print(no);
        int p = 0;
        int q = 0;
        int r = 0;
        switch(no) {
            case 1 :
                answer = 1111 * a;
                break;
            case 2 :
                boolean type = true;
                for(int i : map.keySet()) {
                    int num = map.get(i);
                    if(num == 3) p = i;
                    else if(num == 1) q = i;
                    
                    if (num == 2) {
                        if(p == 0) p = i;
                        else q = i;
                        type = false;
                    }
                }
                answer = type ? (10 * p + q) * (10 * p + q) :
                (p + q) * Math.abs(p - q);
                break;
            case 3 :
                for(int i : map.keySet()) {
                    int num = map.get(i);
                    if(num == 3) p = i;
                    else if(num == 1) {
                        if(q == 0) q = i;
                        else r = i;
                    }                        
                }
                answer = q * r;
                break;
            case 4 :
                answer = Collections.min(map.keySet());
                break;
        }
        
        return answer;
    }
}