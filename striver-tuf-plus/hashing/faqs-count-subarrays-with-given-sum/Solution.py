class Solution:
    def subarraySum(self, nums, k):
        map={0:1}
        count, prefixsum=0,0
        for i in range(len(nums)):
            prefixsum+=nums[i]
            sum= prefixsum-k
            count+=map.get(sum, 0)
            map[prefixsum] = map.get(prefixsum, 0)+1
        return count
