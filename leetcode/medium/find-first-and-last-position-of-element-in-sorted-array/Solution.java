class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first= firstOccurrence(nums,  target);
        if(first == nums.length || nums[first] != target)
            return new int[] {-1, -1};
        int last= lastOccurrence(nums, target)-1;
        return new int[] {first, last};

    }

public int firstOccurrence(int[] nums, int target){
    int low=0, high= nums.length-1, mid, ans= nums.length;
    while(low<=high){
        mid=(low+high)/2;
        if(nums[mid] >= target){
            ans= mid;
            high = mid-1;
        }
        else    
            low = mid+1;
    }
    return ans;
}
public int lastOccurrence(int[] nums, int target){
    int low=0, high= nums.length-1, mid, ans= nums.length;
    while(low<=high){
        mid=(low+high)/2;
        if(nums[mid] > target){
            ans= mid;
            high = mid-1;
        }
        else    
            low = mid+1;
    }
    return ans;
}
}
