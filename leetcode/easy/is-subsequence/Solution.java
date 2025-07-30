class Solution {
    public boolean isSubsequence(String s, String t) {
        int slen= s.length();
        int tlen = t.length();
        int j= 0;
        if(slen == 0)
            return true;
        if(slen>tlen)
            return false;

        for(int i=0; i<tlen; i++){
            if(t.charAt(i) == s.charAt(j)){
                j++;
                if(j==(slen))
                    return true;
            }
        }
        return false;
    }
}
