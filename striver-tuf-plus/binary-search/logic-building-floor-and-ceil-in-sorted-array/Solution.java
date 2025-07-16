class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
       int floor = floorval(nums, x);
       int ceil = ceilval(nums, x);
       return new int[] {floor, ceil};
    }
    public int floorval(int [] nums, int x){
        int low= 0, high=nums.length-1, mid, ans;
        ans = -1;
        while(low<=high){
            mid= (low+high)/2;
            if(nums[mid]<= x){
                ans = nums[mid];
                low = mid+1;
                
            }
            else
               high = mid -1; 
        }
        return ans;
    }
    public int ceilval(int [] nums, int x){
        int low= 0, high=nums.length-1, mid, ans;
        ans = -1;
        while(low<=high){
            mid= (low+high)/2;
            if(nums[mid]>= x){
                ans = nums[mid];
                high = mid -1;
            }
            else
                low = mid+1;
        }
        return ans;
    }
}
