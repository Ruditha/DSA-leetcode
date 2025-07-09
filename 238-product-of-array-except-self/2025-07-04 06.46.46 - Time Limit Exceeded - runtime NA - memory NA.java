class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            p[i]=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j)
                p[i]*=nums[j];
            }
        }
        return p;
    }
}