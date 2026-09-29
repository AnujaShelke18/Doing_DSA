class Solution {
   public int maxSubArray(int[] nums) {
    if (nums == null || nums.length == 0) {
        return 0;
    }

    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
        currSum = currSum + nums[i];

        // 1. ALWAYS update maxSum first so negative numbers are caught properly
        if (currSum > maxSum) {
            maxSum = currSum;
        }

        // 2. Then reset currSum if it drops below zero for the NEXT iteration
        if (currSum < 0) {
            currSum = 0;
        }
    }
    return maxSum;
}
}