class Solution {
    public int findClosest(int x, int y, int z) {
        int diffone=Math.abs(x-z);
        int difftwo=Math.abs(y-z);

        if (diffone<difftwo){
            return 1;
        }
        if (diffone > difftwo){
            return 2;
        }
        else{
        return 0 ;
    }}
}