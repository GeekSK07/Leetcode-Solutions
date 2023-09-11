class Solution {
    static int sum(int n){
        if(n<10){
            return n;
        }
        return n%10+sum(n/10);
    }
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        return addDigits(sum(num));
    }
}
