class Solution:
    def sortZeroOneTwo(self, nums):
        low,mid,high=0,0,len(nums)-1
        while(mid<=high):
            if nums[mid] == 0:
                self.swap(nums, low, mid)
                mid+=1
                low+=1
            elif nums[mid] == 1:
                mid+=1
            else:
                self.swap(nums, mid, high)
                high-=1
    def swap(self, nums, a , b):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp

