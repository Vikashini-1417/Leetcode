class Solution {
    public int[] countBits(int n) {
        int count=0;
        int[] arr=new int[n+1];
        for (int i=0;i<=n;i++){
            count=0;
            String binary = Integer.toBinaryString(i);
            char[] binaryChars = binary.toCharArray();
            for (int j=0;j<binaryChars.length;j++){
                if (binaryChars[j]=='1'){
                    count++;

                }
                arr[i]=count;

            }
        }
        return arr;
    }
}