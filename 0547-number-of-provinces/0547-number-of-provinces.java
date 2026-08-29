class Solution {
  
   
    public int findCircleNum(int[][] isConnected) {
        
        HashMap<Integer,List<Integer>> adj = new HashMap<>();
        for(int i=0;i<isConnected.length;i++){
            adj.put(i,new ArrayList<>());

        }
        int count=0;
        for(int i=0;i < isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1&&i!=j){
                    adj.get(i).add(j);
                }
            }
        }
         boolean visited[]= new boolean[adj.size()]; 
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                dfs(i,visited,adj);
                count++;
            }
        }
   return count; }
     
     public void dfs(int i,boolean [] visited,HashMap<Integer,List<Integer> >adj){
            visited[i]=true;
           for(int j:adj.get(i)){
            if(!visited[j]){
                dfs(j,visited,adj);
            }
           }
    }
}