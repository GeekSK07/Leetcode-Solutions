class Solution {
    static int ans(int num,int step){
        if(num==0){
            return step;
        }
        if(num%2==0){
            return ans(num/2,step+1);
        }
        else{
            return ans(num-1,step+1);
        }
    }
    public int numberOfSteps(int num) {
       return ans(num,0);
    }
}
