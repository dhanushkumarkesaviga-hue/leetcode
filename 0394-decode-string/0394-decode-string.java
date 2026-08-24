class Solution {
    public String decodeString(String s) {
        Stack<String> str = new Stack<>();
        Stack<Integer> nums = new Stack<>();
        String ans = "";
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                n = n * 10 + ((s.charAt(i)) - '0');
            } else if (s.charAt(i) == '[') {
                nums.push(n);
                n = 0;
                str.push("[");
            } else if (s.charAt(i) == ']') {
                String st = "";
                while (!str.peek().equals("[")) {
                    st = str.pop() + st;
                }
                if (str.peek().equals("[")) {
                    str.pop();
                }
                String tem = st;
                int e = nums.pop();
                for (int j = 1; j < e; j++) {
                    st += tem;
                }
                str.push(st);
            } else {
                str.push(String.valueOf(s.charAt(i)));
            }
        }
        while (!str.isEmpty()) {
            ans = str.pop() + ans;
        }
        return ans;
    }

}