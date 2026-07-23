class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (char e : s.toCharArray()) {
            m.put(e, (m.getOrDefault(e, 0)) + 1);
        }
        System.out.print(m);
        int n = m.get(s.charAt(0));
        for (int i : m.values()) {
            if (n != i) {
                return false;
            }
        }

        return true;
    }
}