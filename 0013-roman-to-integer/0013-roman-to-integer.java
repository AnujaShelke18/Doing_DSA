class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int i = 0;
        int n = s.length();
        
        while (i < n) {
            int currentVal = getValue(s.charAt(i));
            
            // Check if there's a next character and if it's larger than the current character
            if (i + 1 < n) {
                int nextVal = getValue(s.charAt(i + 1));
                
                if (currentVal < nextVal) {
                    // Subtractive case
                    total += (nextVal - currentVal);
                    i += 2; // Move past both processed characters
                    continue;
                }
            }
            
            // Standard additive case
            total += currentVal;
            i++;
        }
        
        return total;
    }
    
    // Highly efficient helper function to get value by character
    private int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
