class Solution {
    public boolean isValid(String s) {
        // Map to store matching pairs for O(1) lookups
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If it is a closing bracket
            if (map.containsKey(c)) {
                // Get the top element; use a dummy character '#' if the stack is empty
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                
                // If the mapping doesn't match the stack's top element, it's invalid
                if (topElement != map.get(c)) {
                    return false;
                }
            } else {
                // It is an opening bracket, push it onto the stack
                stack.push(c);
            }
        }
        
        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
 
    
