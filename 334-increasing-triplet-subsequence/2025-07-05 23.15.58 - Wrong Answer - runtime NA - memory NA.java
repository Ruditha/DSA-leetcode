class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i,j,k;
        int n=nums.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                for(k=0;k<n;k++){
                    if(nums[i]<nums[j] && nums[j]<nums[k])
                    return true;
                }
            }
        }return false;
    }
}