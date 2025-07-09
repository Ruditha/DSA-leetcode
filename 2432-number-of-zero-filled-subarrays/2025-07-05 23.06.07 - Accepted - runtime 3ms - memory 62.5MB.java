class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long s=0,c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
            c++;
            else{
                s+=c*(c+1)/2;
                c=0;
            }
        }
        s+=c*(c+1)/2;
        return s;
    }
}