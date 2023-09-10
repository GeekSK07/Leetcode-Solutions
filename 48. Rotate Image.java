class Solution {
    public void rotate(int[][] matrix) {
        int[][] m2=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            int k=0;
            for(int j=matrix[0].length-1;j>=0;j--){
              m2[i][k]=matrix[j][i];
              k++;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=m2[i][j];
            }
        }
    }
}
