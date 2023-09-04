class Solution {
    static int search(int arr[],int target,boolean startindex){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(startindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
     int ans[]={-1,-1};
     int start=search(nums,target,true);
     int end=search(nums,target,false);

     ans[0]=start;
     ans[1]=end;

     return ans;
    }
}
