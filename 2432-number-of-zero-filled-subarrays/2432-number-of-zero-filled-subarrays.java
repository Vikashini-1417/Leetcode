class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long  zero=0;
        long count=0;
        for (int num : nums){
            if (num==0){
                zero++;
                count+=zero;
            }
            else{
                zero=0;
            }
        }
        return count;
        
    }
}