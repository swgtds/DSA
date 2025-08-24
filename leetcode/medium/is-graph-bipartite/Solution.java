class Solution {
    public boolean dfs(int node, int clr, int[][] graph, int[] color){
        color[node] = clr;
        for(int it: graph[node]){
            if(color[it]==-1){
                if(dfs(it, 1 - clr, graph, color)== false)
                    return false;
            }
            else if(color[it] == color[node])
                return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int V= graph.length;
        int[] color = new int[V];
        Arrays.fill(color, -1);
        for(int i=0; i<V; i++){
            if(color[i]==-1){
                if(dfs(i,0, graph, color)== false)
                    return false;
            }
        }
        return true;
    }
}
