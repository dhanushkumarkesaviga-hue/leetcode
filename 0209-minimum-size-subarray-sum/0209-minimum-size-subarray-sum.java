class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int start =0;
        int end =0;
        int window=nums[0];
        if(nums[0]>=target){
            return 1;
        }
        while(end<nums.length-1){
            System.out.println(start+" "+end);
             end++;
             window+=nums[end];
             while(window>=target){
                min= Math.min(min,end-start+1);
              window-=nums[start];
              start++;
             }
        }
        return min==Integer.MAX_VALUE?0:min;

    }
}