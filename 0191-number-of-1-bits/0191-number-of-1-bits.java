class Solution {
    public int hammingWeight(int n) {
        String binary =  Integer.toBinaryString(n);
        int c =0;
        for(char x: binary.toCharArray()){
  if(x=='1'){
    c++;
  }
    }
       return c; }
}