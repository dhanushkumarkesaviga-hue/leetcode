class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,List<Character>> map = new HashMap<>();
         map.put(2,new ArrayList<>(Arrays.asList('a','b','c')));
          map.put(3,new ArrayList<>(Arrays.asList('d','e','f')));
           map.put(4,new ArrayList<>(Arrays.asList('g','h','i')));
            map.put(5,new ArrayList<>(Arrays.asList('j','k','l')));
             map.put(6,new ArrayList<>(Arrays.asList('m','n','o')));
              map.put(7,new ArrayList<>(Arrays.asList('p','q','r','s')));
             map.put(8,new ArrayList<>(Arrays.asList('t','u','v')));
              map.put(9,new ArrayList<>(Arrays.asList('w','x','y','z')));
          int n =digits.length();
                if(n ==1){
                    List<String> lis = new ArrayList<>();
                    int num = Integer.parseInt(digits.charAt(0)+"");
                    List<Character> list = map.get(num);
             for(Character c:list){
                     String f = c+"";  
                     lis.add(f);    
             }return lis;
                }  
               else if(n ==2){
                    List<String> lis = new ArrayList<>();
                    int num1 = Integer.parseInt(digits.charAt(0)+"");
                     int num2 = Integer.parseInt(digits.charAt(1)+"");
                    List<Character> list1 = map.get(num1);
                      List<Character> list2 = map.get(num2);
             for(char c:list1){
                     String s = c+"";
                     for(char d :list2){
                        lis.add(s+(d+""));
                     }  
                     
             }return lis;
                } 
                else if(n ==3){
                    List<String> lis = new ArrayList<>();
                    int num1 = Integer.parseInt(digits.charAt(0)+"");
                     int num2 = Integer.parseInt(digits.charAt(1)+"");
                     int num3 = Integer.parseInt(digits.charAt(2)+"");
                    List<Character> list1 = map.get(num1);
                      List<Character> list2 = map.get(num2);
                       List<Character> list3= map.get(num3);
             for(char c:list1){
                     String s1 = c+"";
                     for(char d :list2){
                        String  s2 = s1+d+"";
                       for(char e : list3){
                       lis.add(s2+e);
                       }
                     }  
                     
             }return lis;
                }
                 else{
                    List<String> lis = new ArrayList<>();
                    int num1 = Integer.parseInt(digits.charAt(0)+"");
                     int num2 = Integer.parseInt(digits.charAt(1)+"");
                     int num3 = Integer.parseInt(digits.charAt(2)+"");
                     int num4 = Integer.parseInt(digits.charAt(3)+"");
                    List<Character> list1 = map.get(num1);
                      List<Character> list2 = map.get(num2);
                       List<Character> list3= map.get(num3);
                        List<Character> list4= map.get(num4);
             for(char c:list1){
                     String s1 = c+"";
                     for(char d :list2){
                        String  s2 = s1+d+"";
                       for(char e : list3){
                     String s3 = s2+e;
                     for(char f:list4){
                        lis.add(s3+f);
                     }
                       }
                     }  
                     
             }return lis;
                }  
    }
}