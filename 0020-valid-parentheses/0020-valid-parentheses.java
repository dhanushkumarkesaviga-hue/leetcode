class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>(); char cha='a'; boolean flag=true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    cha=(char) st.peek();
                    if ((cha=='['&& c==']')||(cha=='('&&c==')')||cha=='{'&&c=='}') {
                        st.pop();
                    }else{
                        flag =false;
                    }
                }
            }
        }
if(st.isEmpty()&&flag) return true;
   return false; }
}