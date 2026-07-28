class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int s=1; int arr[]=new int [nums.length];
        arr[0]=1;
       
        for(int i =1;i<nums.length;i++){
         arr[i] = nums[i-1] *arr[i-1];
        }
          for(int i =nums.length-1;i>=0;i--){
        arr[i] *=s;
        s  *=nums[i];
        }
        return arr;
    }
}