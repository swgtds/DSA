class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        
        StringBuilder ans = new StringBuilder();
        String first = str[0], last = str[str.length-1];
        for(int i = 0; i< Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i))
                break;
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}
