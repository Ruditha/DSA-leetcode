class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);  
    }
    public void reverse(int[] a,int start,int end){
        while(start<end){
            int t=a[start];
            a[start]=a[end];
            a[end]=t;
            start++;
            end--;
        }
    }
}