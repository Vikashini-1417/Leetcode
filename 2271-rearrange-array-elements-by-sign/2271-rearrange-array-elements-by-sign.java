class Solution {
    public int[] rearrangeArray(int[] nums) {
       int[] res=new int [nums.length];
       int pos=0;
       int neg=1;
        
       for(int num:nums){
        if (num>=0){
            res[pos]=num;
            pos=pos+2;
        }
        else if (num<0){

            res[neg]=num;
            neg=neg+2;
        }
       }
       return res;
        
    }
}