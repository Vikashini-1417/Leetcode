class Solution {
    public int reverseBits(int n) {

        String binaryString = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

        String rev = new StringBuilder(binaryString).reverse().toString();
        
        int decimalValue = (int)Long.parseLong(rev, 2);
        
        return decimalValue;
    }
}
