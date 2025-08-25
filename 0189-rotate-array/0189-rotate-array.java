class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if (k>n){
            k=k%n;
        }

        reversed(nums,0,n-1);
        reversed(nums,0,k-1);
        reversed(nums,k,n-1);
    }

        public int[] reversed(int nums[],int start,int end){
            while (start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
         }
        return nums;
        }
}  
    