class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;){
            if (nums[i]!=nums[i+1]){
                return nums[i];}
            else{
               i=i+2;
            }}
           return nums[nums.length - 1];
        }
    
    }
