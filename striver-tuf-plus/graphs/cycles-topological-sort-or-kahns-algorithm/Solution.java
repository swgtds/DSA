class Solution {
    public void dfs(int node, Stack<Integer> st, List<List<Integer>> adj, boolean[] vis){
        vis[node] = true;
        for(int it: adj.get(node)){
            if(!vis[it]){
                dfs(it, st, adj, vis);
            }
        }
        st.push(node);
    }
    
    public int[] topoSort(int V, List<List<Integer>> adj) {
        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[V];
        int[] ans = new int[V];
        for(int i= 0; i<V; i++){
            if(!vis[i]){
                dfs(i,st,adj, vis);
            }
        }
        for(int i= 0; i< V; i++){
            ans[i]= st.pop();
        }
        return ans;
    }

}
