class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ransomeMap =new HashMap<>();
        Map<Character,Integer> magazineMap = new HashMap<>();
        for(char i:ransomNote.toCharArray()){
           ransomeMap.put(i,(ransomeMap.getOrDefault(i,0))+1);
        }
        for(char i:magazine.toCharArray()){
  magazineMap.put(i,(magazineMap.getOrDefault(i,0))+1);
        }
      
        for(char c:ransomeMap.keySet()){
              if(ransomeMap.get(c)==null ||magazineMap.get(c)==null){
                                return false;
                              }
        
                else if(magazineMap.get(c)<ransomeMap.get(c)){
    return false;}
                              }
       
   return true; }
}