class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p[]=new int [nums.length];
        int n=nums.length;
        int l=1,r=1;
        for(int i=0;i<n;i++){
            p[i]=l;
            l*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            p[i]*=r;
            r*=nums[i];
        }
         return p;
        } 
    }
