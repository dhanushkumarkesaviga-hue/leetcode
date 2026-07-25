class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return isp(s,l+1,r)||isp(s,l,r-1);
            }else{
                l++;
                r--;
            }
        }
    return true;}

    boolean isp(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }
}