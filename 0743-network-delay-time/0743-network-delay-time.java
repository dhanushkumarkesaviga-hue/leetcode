class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,List<int []>> adjlist = new HashMap<>();
        int [] distance = new int[n+1];
                    Arrays.fill(distance,Integer.MAX_VALUE);

        for(int j =1;j<=n;j++){
            adjlist.put(j,new ArrayList<>());
        }
        for(int i =0;i<times.length;i++){
            int []ex = times[i];
            int u = ex[0];
            int v= ex[1];
            int w = ex[2];
            adjlist.get(u).add(new int[]{v,w});
        }
        PriorityQueue<int[]> pq =new PriorityQueue<>(
            (a,b)->a[1]-b[1]
        ); 
        int src= k;
        distance[src]=0;
        pq.add(new int []{src,0});
while(!pq.isEmpty()){
    int curr[] = pq.poll();
    int node= curr[0];
    int cost = curr[1];
   
    for(int []nei:adjlist.get(node)){
       int v= nei[0];
        int w= nei[1];
        if(cost+w<distance[nei[0]]){
            distance[nei[0]]= cost+w;
            pq.add(new int[]{nei[0],cost+w});
        }
    }
} int ans= 0;
for(int o=1;o<distance.length;o++){
    if(distance[o]==Integer.MAX_VALUE) return -1;
    ans= Math.max(ans,distance[o]);
}
   return ans; }
}