class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>(); char cha='a';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    cha=(char) st.pop();
                    if ((cha=='['&& c!=']')||(cha=='('&&c!=')')||cha=='{'&&c!='}') {
                        return false;
                    }
                }
            }
        }
if(st.isEmpty()) return true;
   return false; }
}