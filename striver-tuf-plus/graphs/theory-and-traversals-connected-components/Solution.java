class Solution {
    public int findNumberOfComponent(int V, List<List<Integer>> edges) {
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for (List<Integer> e : edges) {
            if (e.size() < 2) continue; 
            int u = e.get(0);
            int v = e.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean vis[] = new boolean[V];
        int ans=0; 
        
        for(int i=0; i< V; i++){
            if(!vis[i]){
                dfs(i, adj, vis);
                ans++;
            }
        }
        return ans;
    }
    public void dfs(int node, List<List<Integer>> adj, boolean[] vis){
        vis[node] = true;
        for(int it: adj.get(node)){
            if(!vis[it]){
                dfs(it, adj, vis);
            }
        }
    }
}

