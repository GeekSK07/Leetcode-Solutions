class Solution {
    static boolean bs(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
       for(int i=0;i<matrix.length;i++){
           if(bs(matrix[i],target)){
               return bs(matrix[i],target);
           }
       }
       return false;
    }
}
