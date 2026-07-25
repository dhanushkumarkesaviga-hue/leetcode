class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double max = 0;
        double avg = 0.0;
        for (int i = 0; i < k; i++) {
            avg += nums[i];
        }
        max=avg;
        
        int i =k-1;
        int j=0;
        while(i<nums.length-1){
               i++;
            avg-=nums[j];
            j++;
            avg=avg + nums[i];
            max = Math.max(max,avg);
        }
   return (double)max/k; }
}