import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = numbers.length -1; i >= 0; i--) {
            while(!stack.empty() && numbers[i] >= stack.peek()) {
                stack.pop();
            }
            
            if(stack.empty()) answer[i] = -1;
            else answer[i] = stack.peek();
            
            stack.push(numbers[i]);
        }
        
        return answer;
    }
}