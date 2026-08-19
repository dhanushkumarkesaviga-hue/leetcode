class Solution {
    public int trap(int[] arr) {
        int l=0;int r= arr.length-1;
        int lm=0;int rm=0;int ans=0; int i=0;
         while(l<r)
         { 
            if(lm<=arr[l]){
                lm=arr[l];
            } 
            if(rm<=arr[r]){
                rm=arr[r];
            }
           int res= Math.min(lm,rm);
          ;
           if(lm<=rm){
                    ans+=res-arr[l];
               l++;
           
           }else{
                    ans+=res-arr[r];
               r--;
           }
         }

   return ans; }
    }
