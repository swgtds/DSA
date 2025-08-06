class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1freq[] = new int[26];
        int s2freq[] = new int[26];
        if(s1.length()> s2.length())
            return false;
        for(Character ch: s1.toCharArray()){
            s1freq[ch-'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            s2freq[s2.charAt(i)-'a']++;
            if(i>=s1.length())
                s2freq[s2.charAt(i-s1.length())- 'a']--;
            if(Arrays.equals(s1freq, s2freq))
                return true;
        }
        return false;
    }
}
