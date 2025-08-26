class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int ansstart=0;
        int ansend=0;
        int start=0;
        
        for (int i=0;i<nums.length;i++){
                sum=sum+nums[i];
            
            if (sum>max){
            max=sum;
            ansstart=start;
            ansend=i;
           }
            if (sum<0){
            sum=0;
            start=i+1;
        }
        }
         

        
      return max;  
    }
}