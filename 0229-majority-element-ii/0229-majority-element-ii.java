import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> major = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    major.add(nums[i - 1]);
                }
                count = 1;
            }
        }
        if (count > n / 3) {
            major.add(nums[n - 1]);
        }

        return major;
    }
}
