class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        int diff=0;
        int i=0;
        while(i<nums.length-1){
            if((nums[i+1]-nums[i])>diff){
                diff=nums[i+1]-nums[i];
            }
            i++;
        }
        return diff;
    }
}
