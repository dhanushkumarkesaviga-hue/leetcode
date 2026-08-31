class Solution {int count=0;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        dfs(rooms,visited,0);   
        
    return count == rooms.size();
}
    public void dfs(List<List<Integer>> rooms,boolean visited[],int s){
        if(rooms.get(s)==null){
            return;
        }
        if(visited[s]){
            return;
        }
        visited[s]=true;
        count++;
        for(int i :rooms.get(s)){
            if(!visited[i]){
            dfs(rooms,visited,i);

            }
        }
    
    }
}