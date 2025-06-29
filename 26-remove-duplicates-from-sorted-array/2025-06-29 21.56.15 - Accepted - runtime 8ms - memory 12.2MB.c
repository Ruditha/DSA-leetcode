int removeDuplicates(int* nums, int numsSize) {
    int i=1;
    for(int j=1;j<numsSize;j++){
        if(nums[j]!=nums[i-1]){
            nums[i]=nums[j];
            i++;
        }
    }
    return i;
}