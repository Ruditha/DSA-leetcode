class Solution(object):
    def rotate(self, nums, k):
       nums[:]=nums[-k:]+nums[:-k]
       return nums
        