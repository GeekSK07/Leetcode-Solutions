class Solution {
    public int passThePillow(int n, int time) {
        int res = 0, m = time / (n - 1), r = time % (n - 1);
        if (m % 2 == 0)
        	res = 1 + r;
        else
        	res = n - r;
        return res;
    }
}
