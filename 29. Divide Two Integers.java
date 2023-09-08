class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0 || dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
       int result=dividend/divisor;
       if(dividend<0 && divisor<0){
           result= Math.abs(dividend/divisor);
       }
       if(result<Math.pow(-2,31)){
           return (int)Math.pow(-2,31);
       }
       else if(result>Math.pow(2,31)-1){
           return (int)Math.pow(2,31)-1;
       }
       else{
           return result;
       }
    }
}
