class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int a=1;a<n;a++){
            int b=n-a;
            if (nozero(a) && nozero(b)){
                return new int[]{a,b};
            }
        }
        return new int[]{};
        }

        private boolean nozero(int n){
            while (n>0){
                if (n%10==0) return false;
                    n/=10;
            }
                return true;
            }}
        
