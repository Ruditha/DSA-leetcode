class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map <Integer,Integer> nummap=new HashMap<>();
        for(int i=0;i<n;i++){
            int comp=target-nums[i];
            if(nummap.containsKey(comp))
            return new int [] {nummap.get(comp),i};
            else
            nummap.put(nums[i],i);
        }return new int []{};
    }
}