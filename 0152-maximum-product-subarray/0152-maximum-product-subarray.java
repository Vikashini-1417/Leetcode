class Solution {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            int tempMax = maxSoFar;

            maxSoFar = Math.max(num, Math.max(maxSoFar * num, minSoFar * num));
            minSoFar = Math.min(num, Math.min(tempMax * num, minSoFar * num));

            globalMax = Math.max(globalMax, maxSoFar);
        }

        return globalMax;
    }
}
