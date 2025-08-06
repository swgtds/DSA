class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int sfreq[] = new int[26];
        int pfreq[] = new int[26];
        for(Character ch: p.toCharArray()){
            pfreq[ch-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            sfreq[s.charAt(i)-'a']++;
            if(i>=p.length()){
                sfreq[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(sfreq,pfreq)){
                list.add(i-p.length()+1);
            }
        }
        return list;
    }
}
