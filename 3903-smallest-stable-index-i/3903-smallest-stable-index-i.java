class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if(n==0){
 return -1;
        }
         if (n == 1) {
            return 0;
        }
 List<Integer> list =new ArrayList<>();
 list.add(nums[n-1]); int min = nums[n-1];
    for(int  i=n-2;i>=0;i--){
             min= Math.min(min,nums[i]);
             list.add(min);
    }Collections.reverse(list);
    int prefix = nums[0];
    for(int i=0;i<n;i++){
        prefix=     Math.max(prefix,nums[i]);
        if(prefix - list.get(i)<=k){
          System.out.println(prefix - list.get(i));  
 return i;
        }
    }

 
        return -1;
    }
}