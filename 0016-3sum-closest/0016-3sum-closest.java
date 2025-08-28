class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int closest_sum=nums[0]+nums[1]+nums[2];
        for (int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
           
             while(left<right){
                int current_sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(current_sum-target)<Math.abs(closest_sum-target)){
                    closest_sum=current_sum;
                }

                if (current_sum==target){
                    return current_sum;
                }
                else if (current_sum<target){
                    left++;
                }
                else{
                    right--;
                }
             }
        
           
        }
        return closest_sum;
    }
}