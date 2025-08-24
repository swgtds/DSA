class Solution {
  public boolean dfs(int node, int parent, List<Integer>[] adj, boolean[] vis) {
    vis[node] = true;
    for (int it : adj[node]) {
      if (!vis[it]) {
        if (dfs(it, node, adj, vis) == true) return true;
      } else if (it != parent) return true;
    }
    return false;
  }

  public boolean isCycle(int V, List<Integer>[] adj) {
    boolean vis[] = new boolean[V];
    for (int i = 0; i < V; i++) {
      if (!vis[i]) {
        if (dfs(i, -1, adj, vis) == true) return true;
      }
    }
    return false;
  }
}

