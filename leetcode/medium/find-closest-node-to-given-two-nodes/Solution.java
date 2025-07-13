class Solution {
    int n;

    private void dfs(int[] edges, int startNode, int[] dist, boolean[] visited) {
        visited[startNode] = true;
        int next = edges[startNode];

        if (next != -1 && !visited[next]) {
            dist[next] = dist[startNode] + 1;
            dfs(edges, next, dist, visited);
        }
    }

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        n = edges.length;

        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        boolean[] visited1 = new boolean[n];
        boolean[] visited2 = new boolean[n];

        Arrays.fill(dist1, Integer.MAX_VALUE);
        Arrays.fill(dist2, Integer.MAX_VALUE);

        dist1[node1] = 0;
        dist2[node2] = 0;

        dfs(edges, node1, dist1, visited1);
        dfs(edges, node2, dist2, visited2);

        int minDistNode = -1;
        int minDistTillNow = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (dist1[i] != Integer.MAX_VALUE && dist2[i] != Integer.MAX_VALUE) {
                int maxDist = Math.max(dist1[i], dist2[i]);
                if (maxDist < minDistTillNow) {
                    minDistTillNow = maxDist;
                    minDistNode = i;
                }
            }
        }

        return minDistNode;
    }
}

