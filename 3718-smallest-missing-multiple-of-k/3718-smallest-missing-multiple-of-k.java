class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean flag = false;
        PriorityQueue <Integer> p=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
          if(nums[i]%k==0){
            p.add(nums[i]);
          }
        }int q =0; int  n = p.size(); int expected =k;
        for(int i=1;i<=n;i++){
            q=p.poll();
 if (q < expected) {
                continue; 
            }

            if (q == expected) {
                expected += k;
            } else {
                return expected;
            }
 }
       return q+k;  

    }
}