class Solution {
    List<String> r = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        probe(0,0,n,"");
   return r; }
    void probe (int open ,int close, int n, String s){
 if(open==n && close==n){
    r.add(s);
    return ;
 }
 if(open<n){
probe(open+1,close,n,s+"(");
 }
 if(open>close){
probe(open,close+1,n,s+")");
 }
    }
}