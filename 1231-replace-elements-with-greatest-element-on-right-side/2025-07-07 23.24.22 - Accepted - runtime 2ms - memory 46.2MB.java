class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=-1,temp;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                temp=max;
                max=arr[i];
                arr[i]=temp;
            }
            else
            arr[i]=max;
        } return arr;
    }
}