class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> magazineMap = new HashMap<>();
        for (char i : magazine.toCharArray()) {
            magazineMap.put(i, (magazineMap.getOrDefault(i, 1)) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (magazineMap.get(c) == null) {
                return false;
            }

            else if (magazineMap.containsKey(c)) {
                if (magazineMap.get(c) > 0) {
                    magazineMap.put(c,( magazineMap.get(c)) - 1);
                    System.out.println(c+"1");
                }
                if (magazineMap.get(c) == 0||magazineMap.get(c)<0) {
                     System.out.println(c+"2");
                    return false;
                }
            }
        }

        return true;
    }
}