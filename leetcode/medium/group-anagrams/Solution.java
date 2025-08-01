class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs== null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            String strfreq = getFrequency(str);
            if(map.containsKey(strfreq)){
                map.get(strfreq).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(strfreq, list);
            }
        }
        return new ArrayList<>(map.values());
    }


    public static String getFrequency(String str){
        int arr[] = new int[26];
        for(char ch: str.toCharArray()){
            arr[ch-'a']++;
        }
    
        StringBuilder sb = new StringBuilder();
        char ch = 'a';
        for(int i: arr){
            sb.append(ch);
            sb.append(i);
            ch++;
        }
        return sb.toString();
    }
}
