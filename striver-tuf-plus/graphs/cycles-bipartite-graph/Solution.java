class Solution {
    public boolean dfs(int node, int clr, List<List<Integer>> adj, int[] color){
        color[node] = clr;
        for(int it: adj.get(node)){
            if(color[it]==-1){
                if(dfs(it, 1 - clr, adj, color)== false)
                    return false;
            }
            else if(color[it] == color[node])
                return false;
        }
        return true;
    }
    
    
    public boolean isBipartite(int V, List<List<Integer>> adj) {
        int color[] = new int[V];
        Arrays.fill(color, -1);
        for(int i=0; i<V; i++){
            if(color[i]==-1){
                if(dfs(i,0, adj, color)== false)
                    return false;
            }
        }
        return true;
    }
    
}

