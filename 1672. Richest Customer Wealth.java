class Solution {
    static int sum(int arr[]){
       int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int maximumWealth(int[][] accounts) {
        int max=sum(accounts[0]);
        for(int i=1;i<accounts.length;i++){
         if(sum(accounts[i])>max){
             max=sum(accounts[i]);
         }
        }
        return max;
    }
}

