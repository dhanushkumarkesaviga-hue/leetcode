class Solution {
    public int lengthOfLongestSubstring(String s) {
        int Max=0;

        for(int i=0;i<s.length();i++){
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    break;
                }else{
                    set.add(s.charAt(j));
                    Max =Math.max(Max,set.size());
                }
                   
            }

        Max =Math.max(Max,set.size()); } return Max;
    }
}