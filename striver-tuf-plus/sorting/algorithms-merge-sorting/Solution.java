class Solution {
    public int[] mergeSort(int[] nums) {
        int n = nums.length;
        int low= 0;
        int high= n-1;
        mergesort(nums, low,high);
        return nums;
    }

    public static void mergesort(int[] nums, int low, int high){
        int mid=(low+high)/2;

        if(low>=high)
            return;
        mergesort(nums,low,mid);
        mergesort(nums, mid+1, high);
        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high ){
        int left= low;
        int right=mid+1;
        List<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=high){
            if(nums[left]<= nums[right]){
                temp.add(nums[left]);
                left++;
            }    
                
            else{
                temp.add(nums[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while(right<=high){
            temp.add(nums[right]);
            right++;
        }
        int k=0;
        for(int i=low; i<=high;i++){
            nums[i]= temp.get(k++);
        }
    }
}
