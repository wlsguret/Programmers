class Solution {
    public long solution(int n) {
        long[] arr = new long[n];
        switch (n) {
            case 1 : return 1;
            case 2 : return 2;
            case 3 : return 3;
        }
        
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        
        for(int i = 3; i < n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }
        
        return arr[n-1];
    }
}