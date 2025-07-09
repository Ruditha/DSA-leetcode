class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i,j,k;
        int n=nums.length;
        for(i=0;i<n-2;i++){
            for(j=i+1;j<n-1;j++){
                for(k=j+1;k<n;k++){
                    if(nums[i]<nums[j] && nums[j]<nums[k])
                    return true;
                }
            }
        }return false;
    }
}