class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        int n = nums.length;
        if (n < 4) return output;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i

            // Early pruning for i
            long min1 = (long) nums[i] + nums[i+1] + nums[i+2] + nums[i+3];
            if (min1 > target) break; // too large
            long max1 = (long) nums[i] + nums[n-1] + nums[n-2] + nums[n-3];
            if (max1 < target) continue; // too small

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicate j

                // Early pruning for j
                long min2 = (long) nums[i] + nums[j] + nums[j+1] + nums[j+2];
                if (min2 > target) break;
                long max2 = (long) nums[i] + nums[j] + nums[n-1] + nums[n-2];
                if (max2 < target) continue;

                int k = j + 1, l = n - 1;

                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target) {
                        output.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k-1]) k++;  // skip duplicate k
                        while (k < l && nums[l] == nums[l+1]) l--;  // skip duplicate l
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return output;
    }
}
