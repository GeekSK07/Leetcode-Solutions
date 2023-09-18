class Solution {
    public int findMin(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                continue;
            }
            ans=i+1;
        }
        return nums[ans];
    }
}
