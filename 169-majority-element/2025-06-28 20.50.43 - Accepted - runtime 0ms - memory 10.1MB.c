int majorityElement(int* nums, int numsSize) {
    int c=0,candidate;
    for (int i=0;i<numsSize;i++){
        if(c==0)
        candidate=nums[i];
        if(candidate==nums[i])
        c++;
        else
        c--;
    }
    return candidate;
}