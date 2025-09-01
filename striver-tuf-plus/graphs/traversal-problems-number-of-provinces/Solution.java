class Solution {
    public static void dfs(int node, List<Integer>[] adjLs, boolean[] vis){
        vis[node] = true;
        for(int it: adjLs[node]){
            if(!vis[it])
                dfs(it, adjLs, vis);
        }
    }


    public int numProvinces(int[][] adj) {
        int count =0;
        int V = adj.length;

        List<Integer>[] adjLs = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjLs[i] = new ArrayList<>();
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                // self nodes are not considered
                if (adj[i][j] == 1 && i != j) {
                    adjLs[i].add(j); 
                    adjLs[j].add(i); 
                }
            }
        }
        boolean vis[] = new boolean[V];
        for(int i=0; i<V;i++){
            if(!vis[i]){
                count++;
                dfs(i, adjLs, vis);
            }
        }
        return count;
    }
}


