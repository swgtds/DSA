class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,maxlen=0;
        int[] arr = new int[256];
        Arrays.fill(arr,-1);
        while(r<s.length()){
                if(arr[s.charAt(r)]>=l)
                    l= arr[s.charAt(r)]+1;
                int len = r-l+1;
                maxlen = Math.max(maxlen, len);
                arr[s.charAt(r)] = r;
                r++;
            
        }
        return maxlen;
    }
}
