class Solution {
	public int edgeScore(int[] edges) {
		long[] sum = new long[edges.length];

		for(int i = 0;i<edges.length;i++) {
			sum[edges[i]] = sum[edges[i]]  + i;
		}

		long max = 0l;
		int ans = 0;
		for(int i=0;i<sum.length;i++){
			if(sum[i] > max) {
				max = sum[i];
				ans = i;
			}
		}
		return ans;
	}
}
