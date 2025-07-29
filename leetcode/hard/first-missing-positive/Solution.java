class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0,ind ;

        while(i<nums.length){
            ind = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[ind]){
                swap(nums, i, ind);
            }
            else
                i++;
        }

        for(i=0; i<nums.length; i++){

            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }

        public void swap(int[] nums, int i, int ind){
            int temp = nums[i];
            nums[i] = nums[ind];
            nums[ind] = temp;

        }
    }

