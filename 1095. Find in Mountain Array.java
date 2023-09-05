class Solution {
    static int binarysearch(MountainArray arr,int target,int start,int end){
        boolean isAsc=arr.get(start)<arr.get(end);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)==target){
                return mid;
            }
            if(isAsc){
                if(arr.get(mid)>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(arr.get(mid)>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    static int findpeak(MountainArray arr){
        int start=0,end=arr.length()-1;
   while(start<end){
       int mid=start + (end-start)/2;
       if(arr.get(mid)>arr.get(mid+1)){
           end=mid;
       }
       else{
           start=mid+1;
       }
   }
   return start;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=findpeak(mountainArr);
        int first=binarysearch(mountainArr,target,0,peak);
        int second=binarysearch(mountainArr,target,peak,mountainArr.length()-1);
        if(first!=-1){
            return first;
        }
        else{
            return second;
        }
    }
}
