class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int current= 0;int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
current+= nums[i];
max=Math.max(max,current);
if(current<0) current =0;
        }
   return max; }
}