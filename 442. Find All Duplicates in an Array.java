class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int i=0;
        while(i<nums.length){
          int correct=nums[i]-1;
          if(nums[i]!=nums[correct]){
              swap(nums,correct,i);
          }
          else{
              i++;
          }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                l.add(nums[j]);
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
