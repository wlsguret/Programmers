import java.util.*;

class Solution {
    
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { 
                return - Integer.compare(o1,o2);
            }
        });
        for(int work : works) {
            maxHeap.add(work);
        }
        
        for(int i = n; i > 0; i--) {
            Integer a = maxHeap.poll();
            if(a == null) break;
            
            a--;
            
            if(a > 0) maxHeap.add(a);
        }
        
        Iterator<Integer> i = maxHeap.iterator();
        while(i.hasNext()) {
            int a = i.next();
            answer += a * a;
        }
       
        return answer;
    }
    
  
}