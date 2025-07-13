class Solution {
    int answer = -1;

    public void dfs(int node, int[] edges, Map<Integer, Integer> dist, boolean[] vis, int depth) {
        vis[node] = true;
        dist.put(node, depth);

        int neighbor = edges[node];
        if (neighbor != -1) {
            if (!vis[neighbor]) {
                dfs(neighbor, edges, dist, vis, depth + 1);
            } else if (dist.containsKey(neighbor)) {
                answer = Math.max(answer, depth - dist.get(neighbor) + 1);
            }
        }
        //dist.remove(node);
    }

    public int longestCycle(int[] edges) {
        int n = edges.length;
        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                Map<Integer, Integer> dist = new HashMap<>();
                dfs(i, edges, dist, vis, 1);
            }
        }

        return answer;
    }
}

