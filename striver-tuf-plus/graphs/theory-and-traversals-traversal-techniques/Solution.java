class Solution {
    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        boolean visited[] = new boolean[V];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<V; i++){
            if(!visited[i])
                dfs(i, adj, visited, list);
        } 
        return list;
    }
    public void dfs(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> list){
      visited[node] = true;
      list.add(node);
      for(int i: adj.get(node)){
        if(!visited[i]){
            dfs(i, adj, visited, list);
      }
      }
    }
    
    public List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        List <Integer> list = new ArrayList<>();
        Queue<Integer> q= new LinkedList<>();
        boolean visited[] = new boolean[V];
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            Integer node = q.poll();
            list.add(node);
            for(int it: adj.get(node)){
                if(!visited[it]){
                    visited[it] = true;
                    q.add(it);
            }
            }
        }
        return list;
    }
}


