class Solution {
    static int digitcount(int n){
        return (int)Math.log10(n) + 1;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(digitcount(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }
}
