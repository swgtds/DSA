class Solution {
    public int searchInsert(int[] nums, int target) {
        int low= 0 , high = nums.length-1, mid , ans = nums.length; 
      while(low<=high){
        mid = (low+high)/2;
        if(nums[mid] >= target ){
            ans = mid;
            high = mid -1 ;
        }
        else 
            low = mid +1;

      }
      return ans;
    }
}
