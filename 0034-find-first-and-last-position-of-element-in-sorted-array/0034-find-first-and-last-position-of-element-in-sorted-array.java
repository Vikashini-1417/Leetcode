class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1; 
        result[1] = -1;

        // find first occurrence
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] >= target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
            if (nums[mid] == target) {
                result[0] = mid;
            }
        }

        // find last occurrence
        i = 0; j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] <= target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
            if (nums[mid] == target) {
                result[1] = mid;
            }
        }

        return result;
    }
}
