class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int k = n / 3;  
        long res = 0;
        int i = n - 2;  

        while (k-- > 0) {
            res += nums[i];
            i -= 2; 
        }
        return res;
    }
}

