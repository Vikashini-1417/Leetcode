class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[2];
        int k=0;
        for (int i=0;i<nums.length;){
            if (i==nums.length-1 || nums[i]!=nums[i+1] ){
                arr[k++]=nums[i];
                i++;
            }
            else {
               i+=2;
            }
            if (k==2){
                break;
            }
        }
      return arr;  
    }
}