class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int j=0;
        while(j<nums.length){
            int correct=nums[j]-1;
            if(nums[j]!=nums[correct]){
                swap(nums,correct,j);
            }
            else{
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
              l.add(i+1);
            }
        }
        return l;
    }
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
