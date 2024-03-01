class Solution {
    public int[] solution(int l, int r) {    
        List list = new List();
        int start = l % 5 == 0 ? l : l + 5 - (l % 5);
        
        int cnt = 0;
        for(int i = start; i <= r; i += 5) {
            String num = Integer.toString(i);
            if(num.matches("[05]+")) {
                list.add(Integer.parseInt(num));
                cnt++;
            }
        }
        if (cnt == 0) {
            return new int[] {-1};
        }
        return list.getArray();
    }
    
    class List {
        private int[] array;
        private int size;
        private int index = 0;
        
        public List() {
            this.size = 1;
            this.array = new int[1];
        }
        
        public int[] getArray() {
            return this.array;
        }
        
        public void add(int num) {
            if(index != 0) {
                int size = this.size = this.array.length + 1;
                int[] temp = new int[size];
                for(int i = 0; i < array.length; i++) {
                    temp[i] = this.array[i];
                }
                this.array = temp;
            }
            this.array[this.index++] = num;
        }
        
    }
}