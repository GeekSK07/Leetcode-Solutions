class Solution {
    static int binarysearch(int x){
        int start=1,end=x/2,mid,ans=0;
        long temp;
        while(start<=end){
            mid=start+(end-start)/2;
            temp=(long)mid*(long)mid;

            if(temp==x){
                return (int)Math.ceil(mid);
            }
            else if(temp<x){
                ans=(int)Math.ceil(mid);
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        return binarysearch(x);
    }
}
