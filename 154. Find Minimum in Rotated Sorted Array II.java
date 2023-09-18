class Solution {
    public int findMin(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
          if(i==nums.length-1){
              return nums[0];
          }
          if(nums[i+1]<nums[i]){
              ans=i+1;
          }
          else{
              continue;
          }
          return nums[ans];
        }
        return 0;
    }
}
