class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max=0
        s=list(set(nums))
        for i in range(len(s)):
            if nums.count(s[i])>max:
                k=s[i]
                max=nums.count(s[i])
        return (k)
        