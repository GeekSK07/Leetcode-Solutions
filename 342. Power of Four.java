class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        return n==Math.pow(4,Math.round(Math.log(n)/Math.log(4)));
    }
}
