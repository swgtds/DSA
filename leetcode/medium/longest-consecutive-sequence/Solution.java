class Solution {
    public int longestConsecutive(int[] nums) {
        int count, longest=1,x;
        Set<Integer> set = new HashSet<>();
        if(nums.length==0)
            return 0;
        
        for(int i =0; i< nums.length; i++){
            set.add(nums[i]);
        }
        
        for(Integer it: set){

            if(!set.contains(it-1)){
                x=it;
                count =1;
                while(set.contains(x+1)){
                    count+=1;
                    x+=1;

                }
                longest = Math.max(longest, count);
            }
        }
        return longest;

    }
}
