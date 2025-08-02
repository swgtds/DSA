// class Solution {
//     public void sortColors(int[] nums) {
//         int count0 = 0, count1 = 0, count2 = 0;
//         for (int num : nums) {
//             if (num == 0) count0++;
//             else if (num == 1) count1++;
//             else count2++;
//         }

//         int index = 0;
//         while (count0-- > 0) nums[index++] = 0;
//         while (count1-- > 0) nums[index++] = 1;
//         while (count2-- > 0) nums[index++] = 2;
//     }
// }


//By Dutch National Flag Algorithm
class Solution {
    public void sortColors(int[] nums) {
        int low=0, mid=0, high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
            }
            else if(nums[mid]== 1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public void swap(int[] nums, int a, int b){
        int temp= nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
