class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i =1; i<arr.length; i++){
            minDiff= Math.min(minDiff, Math.abs(arr[i]- arr[i-1]));
        }
        for(int i=1; i<arr.length; i++){
            List <Integer> pair = new ArrayList<>();
            if(Math.abs(arr[i]-arr[i-1]) == minDiff){
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                list.add(pair);
            }
        }
        return list;
    }
}
