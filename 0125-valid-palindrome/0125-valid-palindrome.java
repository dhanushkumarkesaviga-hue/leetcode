class Solution {
    public boolean isPalindrome(String s) {
        String res= s.replaceAll("[^a-zA-Z0-9]","");
        res= res.toLowerCase();
        int left=0;
        int right = res.length()-1;
        while(left<right){
            if(res.charAt(left)!=res.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        } return true;
    }
}