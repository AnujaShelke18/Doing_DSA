class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1; // Start k at 1 because index 0 is already unique

        for (int scan = 1; scan < nums.length; scan++) {
            if (nums[scan] != nums[scan - 1]) {
               nums[k] = nums[scan];
               k++;
            }
        }
        return k;
    }
}