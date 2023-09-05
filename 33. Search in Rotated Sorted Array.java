lass Solution {
    static int findpivot(int arr[]){
         int start=0,end=arr.length-1;
         while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
            end=mid-1;
            }
            else{
                start=mid+1;
            }
         }
         return -1;
    }
    static int binarysearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivot=findpivot(nums);
        int r1=binarysearch(nums,target,0,pivot);
        int r2=binarysearch(nums,target,pivot+1,nums.length-1);
        if(r1!=-1){
            return r1;
        }
        else{
            return r2;
        }
    }
}
