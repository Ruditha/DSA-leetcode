class Solution(object):
    def majorityElement(self, nums):
        max=0
        for i in list(set(nums)):
          if nums.count(i)>max:
             k=i
             max=nums.count(i)
        return (k)