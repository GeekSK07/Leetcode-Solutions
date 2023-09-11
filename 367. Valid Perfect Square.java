class Solution {
    static int binarysearch(int n){
        int start=0,end=n/2,mid,ans=0;
        long temp;
        while(start<=end){
            mid=start+(end-start)/2;
            temp=(long)mid*(long)mid;
            if(temp==n){
                return (int)Math.ceil(mid);
            }
            else if(temp<n){
                 start=mid+1;
                 ans=(int)Math.ceil(mid);
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    static int sqrt(int n){
        if(n<=1){
            return n;
        }
        return binarysearch(n);
    }
    public boolean isPerfectSquare(int num) {
        return (sqrt(num)*sqrt(num))==num;
    }
}
