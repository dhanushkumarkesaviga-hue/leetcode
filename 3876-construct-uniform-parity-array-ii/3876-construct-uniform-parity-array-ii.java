class Solution {
    public boolean uniformArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int ans = Integer.MAX_VALUE;
            if (nums[i] % 2 != 0) {
                ans = nums[i];
            }
            min = Math.min(ans, min);
         System.out.print(min);}
        for (int i = 0; i < nums.length; i++) {
            if (min == Integer.MAX_VALUE) {
                return true;
            }
            if (nums[i] % 2 == 0 && nums[i] <= min) {
                return false;
            }
        }
        return true;
    }
}