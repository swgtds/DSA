class Solution {
    public int secondLargestElement(int[] nums) {
        if(nums.length<2)
            return -1;
        int largest= Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i=0; i<nums.length;i++){
            if(nums[i]>largest){
                secondlargest = largest;
                largest= nums[i];
            }
            else if(nums[i]> secondlargest && nums[i] != largest){
                secondlargest = nums[i];
            }
        }
        return secondlargest == Integer.MIN_VALUE ? -1 : secondlargest ;
    }
}
