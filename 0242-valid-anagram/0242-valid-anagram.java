class Solution {
    public boolean isAnagram(String s, String t) {
            Map<Character,Integer> map = new HashMap<>();
              Map<Character,Integer> map1 = new HashMap<>();
              if (s.length() != t.length()) {
    return false;
}
            for(char c:s.toCharArray()){
                map.put(c,(map.getOrDefault(c,0))+1);

            }
             for(char c:t.toCharArray()){
                map1.put(c,(map1.getOrDefault(c,0))+1);
                
            }
            for(int i=0;i<s.length();i++){
                if(!map1.get(t.charAt(i)).equals(map.get(t.charAt(i))))
                {
                return false;}
            }
    return true;}
}