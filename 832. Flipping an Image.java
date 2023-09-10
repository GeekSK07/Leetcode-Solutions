class Solution {
    static int[] reverse(int arr[]){
        int n=arr.length;
        int[] arrn=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
          arrn[j++]=arr[i];
        }
        return arrn;
    }
    static int[] change(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=1;
            }
            else if(arr[i]==1){
                arr[i]=0;
            }
        }
        return arr;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            image[i]=change(reverse(image[i]));
        }
        return image;
    }
}
