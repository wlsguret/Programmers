class Solution {
    public int[] solution(String s) {
        int loop = 0;
        int remove = 0;
        
        while(!s.equals("1")) {
            int before = s.length();
            int length = getLength(s);
            s = Integer.toBinaryString(length);
            System.out.println(s);
            
            remove += before - length;
            loop++;
        }
        
        
        return new int[] {loop, remove};
    }
    
    int getLength(String s) {
        int length = 0;
        for(char c : s.toCharArray()) {
            if(c == '1') {
                length++;
            }
        }
        return length;
    }
}