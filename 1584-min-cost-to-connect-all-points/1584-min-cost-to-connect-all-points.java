class Solution {
    public int minCostConnectPoints(int[][] points) {
        HashMap<Integer, List<int[]>> adjlist = new HashMap<>();
        int v = points.length;
        for (int i = 0; i < points.length; i++) {
            adjlist.put(i, new ArrayList<>());
        }
        for (int i = 0; i < v; i++) {
            for (int j = i + 1; j < v; j++) {
                int w = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                adjlist.get(i).add(new int[] { j, w });
                adjlist.get(j).add(new int[] { i, w });

            }
        }
        int a=  cost(adjlist);
    return a;}
    public static int cost(HashMap<Integer, List<int[]>> adjlist){
         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
         boolean []visited = new boolean [adjlist.size()];
         int src = 0;
         pq.add(new int[]{src,0}); int total =0;
         while(!pq.isEmpty()){
            int [] curr = pq.poll();
            int node= curr[0];
            int weight = curr[1];
            if(visited[node]){
                continue;
            }
            visited[node]=true;
            total+=weight;
            for(int arr []:adjlist.get(node)){
                if(visited[arr[0]]){
                    continue;
                }
                else pq.add(new int[]{arr[0],arr[1]});
            }
         }
   return total; }
}