class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int [] a=new int[n];
        if(n==1) 
        a[0]=-1;
        else{
            int max=arr[n-1];
            a[n-2]=arr[n-1];
            a[n-1]=-1;
            for(int i=n-3;i>=0;i--){
                max=Math.max(arr[i+1],max);
                a[i]=max;
            }
        }return a;
    }
}