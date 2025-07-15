class Solution {
    public int upperBound(int[] nums, int x) {
        int low=0, high= nums.length-1;
        int mid, ans= nums.length;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>x){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}

