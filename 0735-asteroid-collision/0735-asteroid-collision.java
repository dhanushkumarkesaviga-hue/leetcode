class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
          boolean flag= true;
            
                while (flag &&!(st.isEmpty()) && !(st.peek() < 0)&& asteroids[i] < 0 ){
                if((asteroids[i] * -1) > st.peek())  {
                    st.pop();
                } 
             else if((asteroids[i] * -1)== st.peek()){
                st.pop();
                flag=false;
            }else{
                flag=false;
            } }if(flag) {
                st.push(asteroids[i]);
            }

        }
        int arr[] = new int[st.size()]; int i=st.size()-1;
        while(!st.isEmpty()){
            arr[i--]=st.pop();
        }
        return arr;
    }
}