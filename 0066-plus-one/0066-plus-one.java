class Solution {
    public int[] plusOne(int[] digits) {
    // Loop backward from the last digit to the first
    for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++; // Simply add 1
            return digits; // Return early.
        }
        
        // If the digit was 9, it rolls over to 0
        digits[i] = 0;
    }
    
    // If the loop completely finishes, it means the number was all 9s (e.g., 999 -> 000)
    // We must create a new array with an extra slot
    int[] newNumber = new int[digits.length + 1];
    newNumber[0] = 1; // The rest of the indices default to 0 automatically (e.g., 1000)
    
    return newNumber;
}

}